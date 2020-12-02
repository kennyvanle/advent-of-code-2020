package main.java.handler;

import java.util.List;

public class Day2Handler {

    public static int day2part1(List<String> list){
        int validPasswords = 0;
        for(String s: list){
            String[] splitString = s.split("\\s+");
            String[] splitNumbers = splitString[0].split("-");
            int min = Integer.parseInt(splitNumbers[0]);
            int max = Integer.parseInt(splitNumbers[1]);

            char requiredLetter = splitString[1].charAt(0);
            int letterCount = 0;

            for(char c: splitString[2].toCharArray()){
                if(c == requiredLetter){
                    letterCount ++;
                }
            }
            if(min <= letterCount && letterCount<=max){
                validPasswords++;
            }

        }
        return validPasswords;
    }

    public static int day2part2(List<String> list){
        int validPasswords = 0;
        for(String s: list){
            String[] splitString = s.split("\\s+");
            String[] splitNumbers = splitString[0].split("-");
            int index1 = Integer.parseInt(splitNumbers[0]);
            int index2 = Integer.parseInt(splitNumbers[1]);

            char requiredLetter = splitString[1].charAt(0);

            int count = 0;

            if(splitString[2].charAt(index1-1) == requiredLetter){
                count++;
            }
            if(splitString[2].charAt(index2-1) == requiredLetter){
                count++;
            }
            if(count == 1){
                validPasswords++;
            }

        }
        return validPasswords;
    }
}
