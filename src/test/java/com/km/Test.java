package com.km;
/**
 * Created by asus-pc on 2019/8/8.
 */

/**
 * @ClassName Test
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/8/8 11:09
 * @Version 1.0
 **/
public class Test {
    public static boolean matches(String word, int len, char[][] charsArray, int height, int width, int x, int y, int count, String tempStr){
        boolean result = false;
        if(charsArray == null || height < 1 || width < 1 || word == null || len < 1 || len < count){
            return result;
        }
        tempStr += String.valueOf(charsArray[x][y]);
        if(len == count){
            if(word.equalsIgnoreCase(tempStr)){
                result =  true;
            }else{
                result = false;
            }
        }else {
            if(x < height - 1){
                result = matches(word,len,charsArray,height,width,++x,y,++count,tempStr);
                return result;
            }
            if(x > 0){
                result = matches(word,len,charsArray,height,width,--x,y,++count,tempStr);
                return result;
            }
            if(y < width - 1){
                result = matches(word,len,charsArray,height,width,x,++y,++count,tempStr);
                return result;
            }
            if(y > 0){
                result = matches(word,len,charsArray,height,width,x,--y,++count,tempStr);
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "adx";
        String str2 = "fjh";
        String str3 = "axh";
        char[][] charsArray = {{'a','e','f'},{'d','x','j'},{'m','q','h'}};
        System.out.println(matches(str1,str1.length(),charsArray,charsArray.length,charsArray[0].length,0,0,1,""));
    }
}
