package main.java;

import main.java.handler.Day1Handler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Day 1 part 1 solution is: " +day1part1());
        System.out.println("Day 1 part 2 solution is: " +day1part2());
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
}
