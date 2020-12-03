package main.java.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Slope {

    public int right;
    public int down;


    public Slope(int right, int down){
        this.right = right;
        this.down = down;
    }

}
