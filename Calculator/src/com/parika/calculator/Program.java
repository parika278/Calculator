/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parika.calculator;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void menu() {
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Multi");
        System.out.println("4.Div");
        System.out.println("5.Power");
        System.out.println("What do you prefer [1-6]");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter First Number");
            double firstNumber = input.nextDouble();
            System.out.println("Enter Second Number");
            double secondNumber = input.nextDouble();
            menu();
            int prefered = input.nextInt();
            switch (prefered) {
                case 1:
                    System.out.println(firstNumber + secondNumber);
                    break;
                case 2:
                    System.out.println(firstNumber - secondNumber);
                    break;
                case 3:
                    System.out.println(firstNumber * secondNumber);
                    break;
                case 4:
                    System.out.println(firstNumber / secondNumber);
                    break;
                case 5:
                    double total = 0;
                    for (int i = 0; i <= secondNumber; i++) {
                        total = firstNumber * secondNumber;
                    }
                    System.out.println(total);
                    break;
               
            }
            System.out.println("Do you want to continue[Y/N]");
            if(input.next().equalsIgnoreCase("n")){
                System.exit(012);
            }
        }
    }

}
