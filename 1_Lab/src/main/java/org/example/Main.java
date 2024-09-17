package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Exercise 1");
        int n = 500;
        List<String> res = exercise_1(n);
        System.out.println(res);

        System.out.println("\n Exercise 2");
        String s = "make install";
        String s2 = exercise_2(s);
        System.out.println(s2);

        System.out.println("\n Exercise 3");
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        List<String> res2 = exercise_3(a,b,c);
        System.out.println(res2);

        System.out.println("\n Exercise 4");
        double eps = Math.pow(10,-6);
        double res3 = exercise_4(eps);
        System.out.println(res3);

        System.out.println("\n Exercise 5");
        String s3= "dyfyd";
        //System.out.println(s3);
        System.out.println(exercise_5(s3));

    }

    public static List<String> exercise_1(int n) {
        List<String> list = new ArrayList<>();
        if (n<=0){
            list.add("not");
            return list;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                list.add("fizzbuzz");
            } else if (i % 5 == 0) {
                list.add("fizz");
            } else if (i % 7 == 0) {
                list.add("buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static String exercise_2(String s){


        String s2 = "";
        for (int i = s.length()-1; i>=0;i--){

            s2+=s.charAt(i);
        }

        return s2;
    }

    public static List<String> exercise_3(double a,double b, double c){
        //List<Float> res = ArrayList<>();
        List<String> list = new ArrayList<>();
        double eps = 1e-67, x;

        if (Math.abs(a)<eps){
            //bx+c=0
            //x = -c/b
            if(Math.abs(b)<eps){
                if(Math.abs(c)<eps){
                    list.add("0.0");
                    return list;
                }
                list.add("not");
            }
            else{
                list.add(String.valueOf(-c/b));
            }
            return list;

        }
        double D = b*b - 4 * a * c;
        //System.out.println(D);
        if (D>= eps){
            x = (-b-(double)Math.sqrt(D)) / (2*a);
            list.add(String.valueOf(x));
            x = (-b+(double)Math.sqrt(D)) / (2*a);
            list.add(String.valueOf(x));
        }
        else{
            list.add("not");
        }
        return list;
    }

    public static double exercise_4(double eps){
        double x, s=0;
        int n = 2;
        do{
            x = 1/(Math.pow(n,2) + n - 2);
            s+= x;
        }while (x<eps);

        return s;
    }

    public static Boolean exercise_5(String s){
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}