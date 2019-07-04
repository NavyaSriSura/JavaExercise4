package com.stackroute;

public class SortParagraph {
    public String[] sortPara(String string) {

        //checking string is empty

        if (string != "") {

            //spliting string

            String array[] = string.split(" ");

            //sorting the words in asscending order

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j].compareToIgnoreCase(array[i]) < 0) {
                        String t = array[i];
                        array[i] = array[j];
                        array[j] = t;
                    }
                }
            }
            return array;
        } else {
            String array[] = {"should not enter empty string"};
            return array;
        }

    }
}
