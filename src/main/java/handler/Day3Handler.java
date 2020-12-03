package main.java.handler;

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
}