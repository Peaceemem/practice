package com.emem.practice;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class practice {
    public static void main(String[]args) throws InterruptedException {
        int num1, num2, operator;
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1 - Add \n 2 - Subtraction \n 3 - Multiplication \n 4 - Divion \n 5 - Remainder");
        System.out.print("Choose operator: ");
        operator = sc.nextInt();

        while (operator < 1 || operator > 5) {
            System.out.println("you entered an invalid number");
            Thread.sleep(1000);
            System.out.println("Enter a valid number");
            operator = sc.nextInt();
        }


       // while (operator <= 5){
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        double result = 0;
        switch (operator) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num1 % num2;
                break;
            default:
                System.out.println("Enter number is invalid");

        }
        System.out.println("the result is; " + result);
    //}
    }
}
