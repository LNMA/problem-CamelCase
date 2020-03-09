package com.louay.projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input your word");
        String word = input.nextLine();

        String [] wordSplit = word.split("[A-Z]");

        System.out.println("number of word is : "+wordSplit.length);
    }
}
