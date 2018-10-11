package com.example.demo.games;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * math games FizzBuzz
 * @author bill.lai 2018/10/11.
 */
public class FizzBuzz{

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    /**
     * 第一阶段：
     * 当数字能被3整除时say Fizz
     * 当数字能被5整除时say Buzz
     * 当数字能被3整除并且也能被5整除时say FizzBuzz
     * @param number
     * @return
     */
    public static String fizzBuzzOneGame(int number){
        if(isDivisibleByDivisor(number, 3) && isDivisibleByDivisor(number, 5)){
            //能被3跟5整除
            return FIZZ_BUZZ;
        }else if(isDivisibleByDivisor(number, 3)){
            //能被3整除
            return FIZZ;
        }else if(isDivisibleByDivisor(number, 5)){
            //能被5整除
            return BUZZ;
        }
        //都不能整除则直接返回
        return String.valueOf(number);
    }

    /**
     * 第二阶段：
     * 当数字能被3整除或者包含有3时say Fizz
     * 当数字能被5整除或者包含有5时say Buzz
     * 当数字能被3整除或者能被5整除或者包含有3或者5时say FizzBuzz
     * @param number
     * @return
     */
    public static String fizzBuzzTwoGame(int number){
        if(isDivisibleByDivisor(number, 3) || isContainsByNumber(number, 3)){
            //能被3整除或者包含3
            return FIZZ;
        }else if(isDivisibleByDivisor(number, 5) || isContainsByNumber(number, 5)){
            //能被5整除或者包含5
            return BUZZ;
        }else if(isDivisibleByDivisor(number, 3) || isDivisibleByDivisor(number, 5) || isContainsByNumber(number, 3) || isContainsByNumber(number, 5)){
            //能被3整除或者也能被5整除或者包含有3或者5
            return FIZZ_BUZZ;
        }
        //都不能整除则直接返回
        return String.valueOf(number);
    }

    /**
     * param number能被param divisor整除
     * @param number
     * @param divisor
     * @return
     */
    private static boolean isDivisibleByDivisor(int number, int divisor){
        return number % divisor == 0;
    }

    /**
     * 数字param number是否包含param containNumber
     * @param number
     * @param containNumber
     * @return true：包含 false：不包含
     */
    private static boolean isContainsByNumber(int number, int containNumber){
        Matcher matcher = Pattern.compile(".*[" + containNumber + "]+.*").matcher(String.valueOf(number));
        return matcher.matches();
    }

    public static void main(String[] args){

        System.out.println("========第一阶段游戏========");

        //第一个阶段的游戏
        for(int i = 1; i <= 100; i++){
            System.out.println(FizzBuzz.fizzBuzzOneGame(i));
        }

        System.out.println("\n========第二阶段游戏========");

        //第二个阶段的游戏
        for(int i = 1; i <= 100; i++){
            System.out.println(FizzBuzz.fizzBuzzTwoGame(i));
        }

    }

}
