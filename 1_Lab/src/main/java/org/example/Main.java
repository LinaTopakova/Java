package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        exercise_1();
        exercise_2();
        exercise_3();
        exercise_4();
        exercise_5();
    }

    public static void exercise_1() {

        System.out.println("Exercise 1");

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void exercise_2(){
        System.out.println("\n Exercise 2");

        String s = "make install", s2 = "";
        for (int i = s.length()-1; i>=0;i--){
            s2+=s.charAt(i);
        }

        System.out.println(s2);
    }

    public static void exercise_3(){
        System.out.println("\n Exercise 3");


    }

    public static void exercise_4(){
        System.out.println("\n Exercise 4");

        double e,s=0;
        for (int n=2;;n++){
            e = 1/(Math.pow(n,2) + n - 2);
            s+=e;
            if(e<Math.pow(10,-6)){
                //System.out.println(n);
                //System.out.println(e);
                break;
            }
        }

        System.out.println(s);
    }

    public static void exercise_5(){
        System.out.println("\n Exercise 5");
        Scanner scanner = new Scanner(System.in);

        String s1 = "";

    }
}