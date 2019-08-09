package com.company.usinglist;
import com.company.model.Hall;
import java.util.ArrayList;
import java.util.List;

public class HallList {
    public static List<Hall>createHallList(){

        List<Hall> halls = new ArrayList<>();
        halls.add(new Hall(1,80,"VIP"));
        halls.add(new Hall(2,80,"normal"));
        halls.add(new Hall(3,80,"premium"));
        halls.add(new Hall(4,80,"normal"));
        halls.add(new Hall(5,80,"VIP"));

        return halls;
    }
}
