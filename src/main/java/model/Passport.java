package main.java.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Passport {
    public int byr;
    public int iyr;
    public int eyr;
    public String hgt;
    public String hcl;
    public String ecl;
    public String pid;
    public int cid;
}
