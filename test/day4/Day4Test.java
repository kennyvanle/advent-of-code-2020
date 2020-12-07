package day4;

import main.java.handler.Day4Handler;
import org.junit.Assert;
import org.junit.Test;

public class Day4Test {

    @Test
    public void part1Test(){
        String input = "iecl:gry pid:860033327 eyr:2020 hcl:#fffffd" + System.lineSeparator()+
                "byr:1937 iyr:2017 cid:147 hgt:183cm" + System.lineSeparator() +
                System.lineSeparator() +
                "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884" + System.lineSeparator() +
                "hcl:#cfa07d byr:1929" + System.lineSeparator() +
                System.lineSeparator() +
                "hcl:#ae17e1 iyr:2013" + System.lineSeparator() +
                "eyr:2024" + System.lineSeparator() +
                "ecl:brn pid:760753108 byr:1931" + System.lineSeparator() +
                "hgt:179cm" + System.lineSeparator() +
                System.lineSeparator() +
                "hcl:#cfa07d eyr:2025 pid:166559648" + System.lineSeparator() +
                "iyr:2011 ecl:brn hgt:59in";

        Assert.assertEquals(2, Day4Handler.part1(input));
    }

    @Test
    public void part2Test(){
        String input = "eyr:1972 cid:100" + System.lineSeparator() +
                "hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926" + System.lineSeparator() +
                System.lineSeparator() +
                "iyr:2019" + System.lineSeparator() +
                "hcl:#602927 eyr:1967 hgt:170cm" + System.lineSeparator() +
                "ecl:grn pid:012533040 byr:1946" + System.lineSeparator() +
                System.lineSeparator() +
                "hcl:dab227 iyr:2012" + System.lineSeparator() +
                "ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277" + System.lineSeparator() +
                System.lineSeparator() +
                "hgt:59cm ecl:zzz" + System.lineSeparator() +
                "eyr:2038 hcl:74454a iyr:2023" + System.lineSeparator() +
                "pid:3556412378 byr:2007" + System.lineSeparator()+
                System.lineSeparator() +
                "pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980" + System.lineSeparator() +
                "hcl:#623a2f" + System.lineSeparator() +
                System.lineSeparator() +
                "eyr:2029 ecl:blu cid:129 byr:1989" + System.lineSeparator() +
                "iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm" + System.lineSeparator() +
                System.lineSeparator() +
                "hcl:#888785" + System.lineSeparator() +
                "hgt:164cm byr:2001 iyr:2015 cid:88" + System.lineSeparator() +
                "pid:545766238 ecl:hzl" + System.lineSeparator() +
                "eyr:2022" + System.lineSeparator() +
                System.lineSeparator() +
                "iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719";

        Assert.assertEquals(4, Day4Handler.part2(input));

    }
}
