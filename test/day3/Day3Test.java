package day3;

import main.java.handler.Day3Handler;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Day3Test {

    @Test
    public void part1Test(){
        List<String> ls = new ArrayList<>();
        ls.add("..##.......");
        ls.add("#...#...#..");
        ls.add(".#....#..#.");
        ls.add("..#.#...#.#");
        ls.add(".#...##..#.");
        ls.add("..#.##.....");
        ls.add(".#.#.#....#");
        ls.add(".#........#");
        ls.add("#.##...#...");
        ls.add("#...##....#");
        ls.add(".#..#...#.#");
        Assert.assertEquals(7, Day3Handler.day3part1(ls,3,1));
    }
}
