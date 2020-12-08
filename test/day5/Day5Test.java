package day5;

import main.java.handler.Day5Handler;
import org.junit.Assert;
import org.junit.Test;

public class Day5Test {

    @Test
    public void part1TestSeatId(){
        Assert.assertEquals(357, Day5Handler.getSeatId("FBFBBFFRLR"));
        Assert.assertEquals(567, Day5Handler.getSeatId("BFFFBBFRRR"));
        Assert.assertEquals(119, Day5Handler.getSeatId("FFFBBBFRRR"));
        Assert.assertEquals(820, Day5Handler.getSeatId("BBFFBBFRLL"));
    }
}
