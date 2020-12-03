package main.java.handler;

import java.util.Collections;
import java.util.List;

public class Day1Handler {

    public static int day1part1(List<Integer> list){
        int product = 0;
        Collections.sort(list);
        for(int i=0; i < list.size(); i++){
            for(int j = i+1; j<list.size();j++){
                int diff = 2020 - list.get(i) - list.get(j);
                if(diff == 0){
                    product = list.get(i) * list.get(j);
                    return product;
                }
                if(diff < 0){
                    break;
                }
            }
        }
        return product;
    }

    public static int day1part2(List<Integer> list){
        int product = 0;
        Collections.sort(list);
        for(int i=0; i < list.size(); i++){
            for(int j = i+1; j<list.size();j++){
                for(int k = j+1; k<list.size();k++){
                    int diff = 2020 - list.get(i) - list.get(j) - list.get(k);
                    if(diff== 0){
                        product = list.get(i) * list.get(j) * list.get(k);
                        return product;
                    }
                    if(diff < 0){
                        break;
                    }
                }
            }
        }
        return product;
    }
}
