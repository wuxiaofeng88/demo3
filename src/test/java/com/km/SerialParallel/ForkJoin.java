package com.km.SerialParallel;
/**
 * Created by asus-pc on 2019/9/3.
 */

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/**
 * @ClassName ForkJoin
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/9/3 17:23
 * @Version 1.0
 **/
public class ForkJoin extends RecursiveTask<Long>{
    private long start;
    private long end;
    public ForkJoin(){}
    public ForkJoin(long start, long end){
        this.start = start;
        this.end = end;
    }
    private static final long THRESHOLD = 10000L;

    @Override
    protected Long compute() {
        if(end - start <= THRESHOLD){
            long sum = 0;
            for(long i = start; i < end; i++){
                sum += i;
            }
            return sum;
        }else {
            long middle = (end - start) / 2;
            ForkJoin left = new ForkJoin(start, middle);
            left.fork();
            ForkJoin right = new ForkJoin(middle + 1, end);
            right.fork();
            long leftResult = left.join();
            long rightResult = right.join();
            System.out.println("leftResult: " + leftResult + ",\trightResult:" + rightResult);
            return leftResult + rightResult;
        }
    }

    public static void main(String[] args) {
        //1、采用ForkJoin框架执行
        /*Instant start = Instant.now();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoin(0L, 10000000000L);
        long sum = pool.invoke(task);
        Instant end = Instant.now();
        System.out.println(Duration.between(start,end).getSeconds());*/
        //2、Java8并行parallel()
        Instant start = Instant.now();
        LongStream.rangeClosed(0,10000000000L).parallel().reduce(0, Long::sum);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).getSeconds());
        //并行流，多个线程执行
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.parallelStream().forEach(System.out::println);
        System.out.println("=================================");
        numbers.stream().sequential().forEach(System.out::println);
    }
}
