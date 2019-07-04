package com.stackroute;

import java.util.*;

public class TransposeWords {
    String reverseStr;
    public String reverseString(String string)
    {
        if(string=="")//condition to check if String is empty
        {
            return "Empty strings not allowed";
        }

        reverseStr = "";
        String[] words = string.split(" ");

        for (int i = 0; i < words.length; i++)
        {
            reverseStr += reverseWord(words[i] + " ");
        }
        return reverseStr.trim();
    }
    //reversing the letters of a single word
    public String reverseWord(String word)
    {
        String revWord = "";
        for (int i = word.length() - 1; i >= 0; i--)
        {
            revWord += word.charAt(i);
        }
        return revWord;
    }


}
