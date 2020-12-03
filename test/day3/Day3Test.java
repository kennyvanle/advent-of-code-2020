package day3;

import main.java.handler.Day3Handler;
import main.java.model.Slope;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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


    @Test
    public void part2Test(){
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

        Slope slope1 = new Slope(1,1);
        Slope slope2 = new Slope(3,1);
        Slope slope3 = new Slope(5,1);
        Slope slope4 = new Slope(7,1);
        Slope slope5 = new Slope(1,2);
        List<Slope> listOfSlopes = Arrays.asList(slope1, slope2, slope3, slope4, slope5);


        Assert.assertEquals(336, Day3Handler.day3part2(ls,listOfSlopes));
    }
}
