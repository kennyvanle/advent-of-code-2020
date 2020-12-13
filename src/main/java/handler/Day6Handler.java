package main.java.handler;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Day6Handler {


    public static int part1(String input){
        int sum = 0;
        List<String> ls = Arrays.asList(input.split(System.lineSeparator()+System.lineSeparator()));
        for(String s: ls){

            List<Character> listOfQuestions = new LinkedList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l',
                    'm','n','o','p','q','r','s','t','u','v','w','x','y','z'));
            for(Character c: s.toCharArray()){
                if(listOfQuestions.contains(c)){
                    sum++;
                    listOfQuestions.remove(c);
                }
            }
        }
        return sum;
    }
}
