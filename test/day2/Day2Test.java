package day2;

import main.java.handler.Day2Handler;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Day2Test {

    @Test
    public void part1Test(){
        List<String> ls = new ArrayList<>();
        ls.add("1-3 a: abcde");
        ls.add("1-3 b: cdefg");
        ls.add("2-9 c: ccccccccc");
        Assert.assertEquals(2,Day2Handler.day2part1(ls));
    }

    @Test
    public void part2Test(){
        List<String> ls = new ArrayList<>();
        ls.add("1-3 a: abcde");
        ls.add("1-3 b: cdefg");
        ls.add("2-9 c: ccccccccc");
        Assert.assertEquals(1,Day2Handler.day2part2(ls));
    }
}
