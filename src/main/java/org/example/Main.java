package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        String atcoder = "atcoder";
        boolean result = true;

        for(int i = 0; i < s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(cs == ct){
                continue;
            }

            //どちらかが'@'かつ、もう片方が'atcoder'の文字ならOK
            if(cs == '@' && atcoder.indexOf(ct) != -1) {
                continue;
            }

            if(ct == '@' && atcoder.indexOf(cs) != -1){
                continue;
            }

            result = false;
            break;
        }

        if(result){
            System.out.println("You can win");
        } else {
            System.out.println("You will lose");
        }
    }
}