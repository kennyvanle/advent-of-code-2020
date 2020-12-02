package day1;

import main.java.handler.Day1Handler;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Part1Test {

    @Test
    public void testPart1(){
        List<Integer> ls = new ArrayList<>();
        ls.add(1721);
        ls.add(979);
        ls.add(366);
        ls.add(299);
        ls.add(675);
        ls.add(1456);
        int product = Day1Handler.day1part1(ls);
        Assert.assertEquals(514579, product);
    }

    @Test
    public void testPart2(){
        List<Integer> ls = new ArrayList<>();
        ls.add(1721);
        ls.add(979);
        ls.add(366);
        ls.add(299);
        ls.add(675);
        ls.add(1456);
        int product = Day1Handler.day1part2(ls);
        Assert.assertEquals(241861950, product);
    }
}
