package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (var s : args){
            if (Integer.valueOf(s) % 2 != 0) return false;
        }
        return true;
    }
}