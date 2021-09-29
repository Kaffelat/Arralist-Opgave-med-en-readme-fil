package com.company;
import java.util.Scanner;
import java.util.ArrayList;
//Write a method that takes int n, int k & an Arraylist of Strings as parameter.
//The method will only print the strings from index n to index k.
public class Exercise3 {
    public static void main(String [] args){
        ArrayList<String> k = new ArrayList<String>();
        k.add("hej1");
        k.add("hej2");
        k.add("hej3");
        System.out.print(hej(0,2,k));
    }
    public static  String hej (int l, int n, ArrayList<String> kage){
        for (int i = l; i <= n; i++){
            System.out.println(kage.get(i));
        }
        return kage.get(l);
    }
}
