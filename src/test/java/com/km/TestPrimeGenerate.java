package com.km;/**
 * Created by asus-pc on 2019/5/23.
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestPrimeGenerate
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/5/23 14:39
 * @Version 1.0
 **/
public class TestPrimeGenerate implements Runnable{
    private final List<BigInteger> primes = new ArrayList<BigInteger>();
    private volatile boolean stop = false;

    @Override
    public void run() {
        BigInteger prime = BigInteger.ONE;
        while(!stop){
            prime = prime.nextProbablePrime();
            synchronized (this){
                primes.add(prime);
            }
        }
    }

    public void cancel(){
        this.stop = true;
    }

    public List<BigInteger> getPrimes(){
        return new ArrayList<>(primes);
    }

    public static void main(String[] args) {
        TestPrimeGenerate testPrimeGenerate = new TestPrimeGenerate();
        Thread thread1 = new Thread(testPrimeGenerate);
        Thread thread2 = new Thread(testPrimeGenerate);
        Thread thread3 = new Thread(testPrimeGenerate);
        Thread thread4 = new Thread(testPrimeGenerate);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testPrimeGenerate.cancel();
        System.out.println(testPrimeGenerate.getPrimes());
    }
}
