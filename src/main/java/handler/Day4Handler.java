package main.java.handler;

import com.google.gson.Gson;
import main.java.model.Passport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day4Handler {
    private static final String BIRTH_YEAR = "byr";
    private static final String ISSUE_YEAR = "iyr";
    private static final String EXPIRATION_YEAR = "eyr";
    private static final String HEIGHT = "hgt";
    private static final String HAIR_COLOR = "hcl";
    private static final String EYE_COLOR = "ecl";
    private static final String PASSPORT_ID = "pid";
    private static final String COUNTRY_ID = "cid";
    private static final List<String> validEyeColorList= Arrays.asList("amb","blu","brn","gry","grn","hzl","oth");

    public static int part1(String input){
        int valid = 0;
        List<String> ls = Arrays.asList(input.split(System.lineSeparator() + System.lineSeparator()));
        for(String s: ls){
            if(s.contains(BIRTH_YEAR) && s.contains(ISSUE_YEAR) && s.contains(EXPIRATION_YEAR)
            && s.contains(HEIGHT) && s.contains(HAIR_COLOR) && s.contains(EYE_COLOR)
            && s.contains(PASSPORT_ID)){
                valid++;
            }
        }
        return valid;
    }

    public static int part2(String input){
        int valid = 0;
        List<String> ls = Arrays.asList(input.split(System.lineSeparator() + System.lineSeparator()));
        for(String s: ls){
            if(s.contains(BIRTH_YEAR) && s.contains(ISSUE_YEAR) && s.contains(EXPIRATION_YEAR)
                    && s.contains(HEIGHT) && s.contains(HAIR_COLOR) && s.contains(EYE_COLOR)
                    && s.contains(PASSPORT_ID)){
                try{
                    String jsoString = "{\"" + s + "\"}";
                    jsoString = jsoString.replaceAll(":","\":\"");
                    jsoString = jsoString.replaceAll(" ","\",\"");
                    jsoString = jsoString.replaceAll(System.lineSeparator(),"\",\"");
                    Gson g = new Gson();
                    Passport passport = g.fromJson(jsoString,Passport.class);
                    if((passport.getByr()>=1920 && passport.getByr() <=2002) &&
                            (passport.getIyr()>=2010 && passport.getIyr() <=2020) &&
                            (passport.getEyr()>=2020 && passport.getEyr()<=2030) &&
                            (passport.getHcl().charAt(0)=='#' && passport.getHcl().length()==7) &&
                            (validEyeColorList.contains(passport.getEcl())) &&
                            (passport.getPid().length()==9)){
                        if(passport.getHgt().contains("cm")){
                            String height = passport.getHgt().replaceAll("\\D+","");
                            if(Integer.parseInt(height) >= 150 && Integer.parseInt(height)<=193){
                                valid++;
                            }
                        }else if (passport.getHgt().contains("in")){
                            String height = passport.getHgt().replaceAll("\\D+","");
                            if(Integer.parseInt(height) >= 59 && Integer.parseInt(height)<=76){
                                valid++;
                            }
                        }
                    }
                } catch (Exception e){
                    //System.out.println("Invalid Passport: " + s);
                }
            }
        }
        return valid;
    }
}
