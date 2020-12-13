package day6;

import main.java.handler.Day6Handler;
import org.junit.Assert;
import org.junit.Test;

public class Day6Test {

    @Test
    public void part1Test(){
        String input = "abc" + System.lineSeparator() +
                System.lineSeparator() +
                "a" + System.lineSeparator() +
                "b" + System.lineSeparator() +
                "c" + System.lineSeparator() +
                System.lineSeparator() +
                "ab" + System.lineSeparator() +
                "ac" + System.lineSeparator() +
                System.lineSeparator() +
                "a" + System.lineSeparator() +
                "a" + System.lineSeparator() +
                "a" + System.lineSeparator() +
                "a" + System.lineSeparator() +
                System.lineSeparator() +
                "b";
        Assert.assertEquals(11, Day6Handler.part1(input));

    }
}
