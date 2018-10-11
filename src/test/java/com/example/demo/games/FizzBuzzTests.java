package com.example.demo.games;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * FizzBuzz测试类
 * @author bill.lai 2018/10/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class FizzBuzzTests {

    @Test
    public void fizzBuzzOneGameTest(){
        Assert.assertTrue(FizzBuzz.FIZZ.equals(FizzBuzz.fizzBuzzOneGame(9)));
        Assert.assertFalse(FizzBuzz.FIZZ.equals(FizzBuzz.fizzBuzzOneGame(8)));
        Assert.assertTrue(FizzBuzz.BUZZ.equals(FizzBuzz.fizzBuzzOneGame(20)));
        Assert.assertTrue(FizzBuzz.FIZZ_BUZZ.equals(FizzBuzz.fizzBuzzOneGame(15)));
    }

    @Test
    public void fizzBuzzTwoGameTest(){
        Assert.assertTrue(FizzBuzz.FIZZ.equals(FizzBuzz.fizzBuzzTwoGame(13)));
        Assert.assertTrue(FizzBuzz.BUZZ.equals(FizzBuzz.fizzBuzzTwoGame(25)));
    }

}
