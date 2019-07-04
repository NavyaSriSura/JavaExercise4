package com.stackroute;

import java.util.regex.*;
public class RegularExpression {
    boolean result;

    public String findpresence(String string , String word) {
        if (string != null) {
           if(string.toLowerCase().contains(word.toLowerCase()))//checking if String contains given word
           {
               result = true;
           } else {
                result = false;
           }

            return "Is Harry here ?" + result;

        }else return null;
    }
}


