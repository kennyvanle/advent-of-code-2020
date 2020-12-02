package main.java.handler;

import java.util.List;

public class Day1Handler {

    public static int day1part1(List<Integer> list){
        int product = 0;
        for(int i=0; i < list.size(); i++){
            for(int j = i+1; j<list.size();j++){
                if(2020 - list.get(i) - list.get(j) == 0){
                    product = list.get(i) * list.get(j);
                    return product;
                }
            }
        }
        return product;
    }

    public static int day1part2(List<Integer> list){
        int product = 0;
        for(int i=0; i < list.size(); i++){
            for(int j = i+1; j<list.size();j++){
                for(int k = j+1; k<list.size();k++){
                    if(2020 - list.get(i) - list.get(j) - list.get(k) == 0){
                        product = list.get(i) * list.get(j) * list.get(k);
                        return product;
                    }
                }
            }
        }
        return product;
    }
}
