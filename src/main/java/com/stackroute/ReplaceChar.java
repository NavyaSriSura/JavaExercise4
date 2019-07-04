package com.stackroute;

public class ReplaceChar
{

    public String replace(String string)
    {
        String newString;
        if(string!="") {
            //replacing all occurrences of d with f
             newString = string.replaceAll("d", "f");
             //replacing all occurrences of l with t
            newString = newString.replaceAll("l", "t");

        }
        else newString="Empty strings not allowed";
        return newString;
    }
}
