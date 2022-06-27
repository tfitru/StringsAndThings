package io.zipcoder.stringsandthings;

import io.zipcoder.StringsAndThings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.testng.annotations.Test;

/**
 * @author leon on 29/01/2019.
 */
public class CountYZTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        StringsAndThings stringsAndThingsTest= new StringsAndThings();
    }

    @Test
    public void countYZTest1(){
        StringsAndThings countYZ1 = new StringsAndThings();
        String input = "fez day";
        Integer expected = 2;
        Integer actual = countYZ1.countYZ(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countYZTest2(){
        StringsAndThings countYZ2 = new StringsAndThings();
        String input = "day fez";
        Integer expected = 2;
        Integer actual = countYZ2.countYZ(input);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void countYZTest3 (){
        StringsAndThings countYZ3 = new StringsAndThings();
        String input = "day fyyyz";
        Integer expected = 2;
        Integer actual = countYZ3.countYZ(input);
        Assert.assertEquals(expected, actual);
    }
}
