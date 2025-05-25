package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //自分の回答
//        Scanner sc = new Scanner(System.in);
//
//        String s = sc.next();
//        String t = sc.next();
//        String atcoder = "atcoder";
//        boolean result = true;
//
//        for(int i = 0; i < s.length(); i++){
//            char cs = s.charAt(i);
//            char ct = t.charAt(i);
//
//            if(cs == ct){
//                continue;
//            }
//
//            //どちらかが'@'かつ、もう片方が'atcoder'の文字ならOK
//            if(cs == '@' && atcoder.indexOf(ct) != -1) {
//                continue;
//            }
//
//            if(ct == '@' && atcoder.indexOf(cs) != -1){
//                continue;
//            }
//
//            result = false;
//            break;
//        }
//
//        if(result){
//            System.out.println("You can win");
//        } else {
//            System.out.println("You will lose");
//        }

        //ChatGPTの回答その1
//        Scanner sc = new Scanner(System.in);
//
//        String s = sc.next();
//        String t = sc.next();
//        String atcoder = "atcoder";
//        boolean canWin = true;
//
//        for(int i = 0; i < s.length(); i++){
//            char cs = s.charAt(i);
//            char ct = t.charAt(i);
//
//            if(cs == ct){
//                continue;
//            }
//
//            boolean csIsAt = cs == '@' && atcoder.indexOf(ct) != -1;
//            boolean ctIsAt = ct == '@' && atcoder.indexOf(cs) != -1;
//
//            if(csIsAt || ctIsAt){
//                continue;
//            }
//
//            canWin = false;
//            break;
//        }
//        System.out.println(canWin ? "You can win" : "You will lose");

        //CatGPTの回答その2
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        boolean canWin = true;
        Set<Character> atcoderSet = new HashSet<>(Arrays.asList('a', 't', 'c', 'o', 'd', 'e', 'r'));

        for(int i = 0; i < s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(cs == ct) continue;
            if((cs == '@' && atcoderSet.contains(ct)) ||
                (ct == '@' && atcoderSet.contains(cs))) continue;

            canWin = false;
            break;
        }
        System.out.println(canWin ? "You can win" : "You will lose");
    }
}