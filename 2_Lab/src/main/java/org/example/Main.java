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
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Exercise 1");
        Button button = new Button();
        boolean flag = true;
        while(true) {
            System.out.println("false - exit, true - click");
            flag = scanner.nextBoolean();
            if(!flag){
                break;
            }
            button.click();
        }

        System.out.println("\n Exercise 2");
        Balance scales = new Balance();
        int flag2 = 2, weight = 0;
        while(flag2!=0) {
            System.out.println("0 - exit, 1 - add to right, 2 - add to left, 3 - result");
            flag2 = scanner.nextInt();
            if (flag2 == 1 || flag2 == 2){
                System.out.println("weight: ");
                weight=scanner.nextInt();
            }
            switch (flag2){
                case 1:
                    scales.addRight(weight);
                    break;
                case 2:
                    scales.addLeft(weight);
                    break;
                case 3:
                    System.out.println(scales.result());
                    break;
                default:
                    break;
            }
        }

        System.out.println("\n Exercise 3");
        Bell bell = new Bell();
        while (true){
            System.out.println("false - exit, true - sound");
            flag = scanner.nextBoolean();
            if (!flag)
                break;
            System.out.println(bell.getSounds());
        }

        System.out.println("\n Exercise 4");
        OddEvenSeparator number = new OddEvenSeparator();
        int x;
        flag2 = 1;
        while(flag2 != 0){
            System.out.println("0 - exit, 1 - add number, 2 - even, 3 - odd");
            flag2 = scanner.nextInt();
            switch (flag2) {
                case 1:
                    System.out.println("enter number: ");
                    x = scanner.nextInt();
                    number.addNumer(x);
                    break;
                case 2:
                    number.even();
                    break;
                case 3:
                    number.odd();
                    break;
                default:
                    break;
            }
        }

        System.out.println("\n Exercise 5");
        Table table = new Table(4,5);
        flag2 = 1;
        int i, j, value;
        while(flag2 != 0){
            System.out.println("0 - exit, 1 - .getValue(), 2 - .setValue(), 3 - .rows(), 4 - .cols(), 5 - .toString(), 6 - . average(): ");
            flag2 = scanner.nextInt();
            switch (flag2) {
                case 1:
                    System.out.println("enter rows and cols: ");
                    i = scanner.nextInt();
                    j = scanner.nextInt();
                    System.out.println(table.getValue(i,j));
                    break;
                case 2:
                    System.out.println("enter rows, cols and value : ");
                    i = scanner.nextInt();
                    j = scanner.nextInt();
                    value = scanner.nextInt();
                    table.setValue(i, j, value);
                    break;
                case 3:
                    System.out.println(table.getRows());
                    break;
                case 4:
                    System.out.println(table.getCols());
                    break;
                case 5:
                    System.out.println(table.to_String());
                    break;
                case 6:
                    System.out.println(table.average());
                    break;
                default:
                    break;
            }
        }

        System.out.println("\n Exercise 6");
    }
}

class Button{
    int number_of_click;
    Button(){
        this.number_of_click = 0;
    }
    void click(){
        number_of_click++;
        System.out.println("Number of click: " + number_of_click);
    }
}

class Balance{
    int right;
    int left;
    Balance (){
        this(0,0);
    }
    Balance(int weight_left,int weight_right){
        this.right = weight_right;
        this.left = weight_left;
    }

    void addRight(int weightRight){
        right+=weightRight;
    }

    void addLeft(int weightLeft){
        left+=weightLeft;
    }

    String result(){
        if (right==left)
            return "=";
        if (right>left)
            return "R";
        return "L";
    }
}

class Bell{
    String sounds = "Ding Dong";
    String getSounds(){
        return sounds;
    }
}

class OddEvenSeparator{
    List<Integer> evenNumbers = new ArrayList<Integer>();
    List<Integer> oddNumbers = new ArrayList<Integer>();

    void addNumer(int number){
        if(number%2==0)
            evenNumbers.add(number);
        else
            oddNumbers.add(number);
    }

    void even(){
        System.out.println(evenNumbers);
    }

    void odd(){
        System.out.println(oddNumbers);
    }
}

class Table {
    int rows , cols ;
    int[][] matrix;

    Table(int number_of_rows, int number_of_cols) {
        this.rows = number_of_rows;
        this.cols = number_of_cols;
        this.matrix = new int[this.rows][this.cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.setValue(i,j,0);
            }
        }
    }

    int getValue(int row, int col) {
        return matrix[row][col];
    }

    void setValue(int row,int col,int value){
        matrix[row][col] = value;
    }

    int getRows(){
        return rows;
    }

    int getCols(){
        return cols;
    }

    String to_String(){
        String table = "";
        for(int i = 0; i < rows; i++){
            table+= String.valueOf(i+1) + " rows: ";
            for(int j = 0; j<cols; j++){
                table+= String.valueOf(this.getValue(i,j)) + ", ";
            }
            table += "\n";
        }
        return table;
    }

    Double average(){
        double avr = 0.0;
        for(int  i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                avr += this.getValue(i,j);
            }
        }
        return avr/(this.getRows()*this.getCols());
    }
}





