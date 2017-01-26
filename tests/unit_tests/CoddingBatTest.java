package unit_tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import intro_Java.week3.UnitTests.CoddingBat;

/**
 * Created by Joker on 25.12.2016.
 */
@RunWith(JUnit4.class)
public class CoddingBatTest {

    @Test
    public void test1(){
        int result = CoddingBat.count7(717);
        int expected = 2;
        Assert.assertEquals(expected, result);

    }
    @Test
    public void test2(){
        int result = CoddingBat.count7(7);
        Assert.assertEquals(1, result);
    }
    @Test
    public void test3(){
        Assert.assertEquals(0, CoddingBat.count7(123));
    }
}
