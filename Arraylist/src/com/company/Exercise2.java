package com.company;

import java.util.ArrayList;

//Print the Strings from the last index to the first (reverse order)
public class Exercise2 {
    public static void main(String [] args){
        ArrayList<String> kage = new ArrayList<String>();
        kage.add("hej1"); kage.add("hej2"); kage.add("hej3"); kage.add("hej4");

        for (int i = kage.size() - 1; 0 <= i; i--){
            System.out.println(kage.get(i));
        }

    }
}
