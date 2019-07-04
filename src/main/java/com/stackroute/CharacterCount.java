package com.stackroute;

public class CharacterCount {

    public String countCharacter(String string, String ch) {
        String statement = "";
        if (string != "") //condition to check if given String is Empty
        {
            int charCount;
            //counting the number of occurrences of a given character
            charCount = string.length() - string.replaceAll(ch, "").length();
            statement = Integer.toString(charCount);
        }
        //returning error if Empty string is given
        else
            statement = "Empty strings not allowed";
        return statement;
    }
}
