package org.example;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //自分の回答
//        Scanner sc = new Scanner(System.in);
//        String w = sc.next();
//        String result = "";
//
//        for(int i = 0; i < w.length(); i++) {
//            char a = w.charAt(i);
//            if(a != 'a' && a != 'i' && a != 'u' && a != 'e' && a != 'o') {
//                result += a;
//            }
//        }

//        System.out.println(result);

        //ChatGPTの回答
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        StringBuilder result = new StringBuilder();

        Set<Character> vowels = Set.of('a', 'i', 'u', 'e', 'o');

        for(char c : w.toCharArray()) {
            if(!vowels.contains(c)){
                result.append(c);
            }
        }

        System.out.println(result);
    }
}