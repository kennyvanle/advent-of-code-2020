package main.java;

import main.java.handler.Day1Handler;
import main.java.handler.Day2Handler;
import main.java.handler.Day3Handler;
import main.java.model.Slope;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Day 1 part 1 solution is: " +day1part1());
        System.out.println("Day 1 part 2 solution is: " +day1part2());
        System.out.println("Day 2 part 1 solution is: " +day2part1());
        System.out.println("Day 2 part 2 solution is: " +day2part2());
        System.out.println("Day 3 part 1 solution is: " +day3part1());
        System.out.println("Day 3 part 2 solution is: " +day3part2());
    }

    public static int day1part1(){
        int product = 0;
        List<Integer> ls = new ArrayList<>();
        try {
            ls = readDataInts("day1input.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        product = Day1Handler.day1part1(ls);
        return product;
    }

    public static int day1part2(){
        int product = 0;
        List<Integer> ls = new ArrayList<>();
        try {
            ls = readDataInts("day1input.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        product = Day1Handler.day1part2(ls);
        return product;
    }


    public static int day2part1(){
        int valid = 0;
        List<String> ls = new ArrayList<>();
        try {
            ls = readDataString("day2input.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        valid = Day2Handler.day2part1(ls);
        return valid;
    }


    public static int day2part2(){
        int valid = 0;
        List<String> ls = new ArrayList<>();
        try {
            ls = readDataString("day2input.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        valid = Day2Handler.day2part2(ls);
        return valid;
    }

    public static int day3part1(){
        int valid = 0;
        List<String> ls = new ArrayList<>();
        try {
            ls = readDataString("day3input.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        valid = Day3Handler.day3part1(ls, 3, 1);
        return valid;
    }

    public static long day3part2(){
        long valid = 0;
        List<String> ls = new ArrayList<>();
        try {
            ls = readDataString("day3input.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Slope slope1 = new Slope(1,1);
        Slope slope2 = new Slope(3,1);
        Slope slope3 = new Slope(5,1);
        Slope slope4 = new Slope(7,1);
        Slope slope5 = new Slope(1,2);
        List<Slope> listOfSlopes = Arrays.asList(slope1, slope2, slope3, slope4, slope5);

        valid = Day3Handler.day3part2(ls, listOfSlopes);
        return valid;
    }

    public static List<Integer> readDataInts(String file) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(file);
        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        List<Integer> ls = new ArrayList<>();
        String line;
        while ((line=r.readLine()) != null) {
            ls.add(Integer.parseInt(line));
        }
        return ls;
    }

    public static List<String> readDataString(String file) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(file);
        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        List<String> ls = new ArrayList<>();
        String line;
        while ((line=r.readLine()) != null) {
            ls.add(line);
        }
        return ls;
    }
}
