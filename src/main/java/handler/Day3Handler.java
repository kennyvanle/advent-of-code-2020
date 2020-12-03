package main.java.handler;

import main.java.model.Slope;

import java.util.List;

public class Day3Handler {

    public static int day3part1(List<String> list, int right, int down) {
        int treeCount = 0;
        int xMax = list.get(0).length();
        int xPosition = 0;

        for(int i =down; i<list.size(); i += down){
            xPosition = (xPosition+right) % xMax;
            if(list.get(i).charAt(xPosition) == '#'){
                treeCount++;
            }
        }

        return treeCount;
    }

    public static long day3part2(List<String> list, List<Slope> listOfSlopes) {
        long treeProduct = 1;
        for(Slope slope: listOfSlopes){
            int treeCount = 0;
            int xMax = list.get(0).length();
            int xPosition = 0;

            for(int i =slope.down; i<list.size(); i += slope.down){
                xPosition = (xPosition+ slope.right) % xMax;
                if(list.get(i).charAt(xPosition) == '#'){
                    treeCount++;
                }
            }
            treeProduct *= treeCount;
        }

        return treeProduct;
    }
}