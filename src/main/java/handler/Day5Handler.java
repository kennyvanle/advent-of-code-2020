package main.java.handler;

public class Day5Handler {

    public static int getSeatId(String pass){
        int seatId = 0;
        String s = pass.replaceAll("F","0");
        s = s.replaceAll("L","0");
        s = s.replaceAll("B","1");
        s = s.replaceAll("R","1");
        seatId = Integer.parseInt(s,2);
        return seatId;
    }
}
