package com.example.java;

import java.util.List;

import com.example.java.Olive;

public class OlivePress {

    public int getOil(List<Olive> olives) {

        int totalOil= 0;

        for (Olive o : olives) {
            System.out.println(o.getName());
            totalOil += o.cursh();
        }

        return totalOil;

    }

}
