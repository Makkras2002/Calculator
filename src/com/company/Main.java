package com.company;
import java.lang.String;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calqulator calq1 = new Calqulator();
        System.out.println("The program is launched.");
        boolean isTrue = true;
        int action;
        while(isTrue)
        {
            System.out.println("_______________Menu________________");
            System.out.println("1. Count sum.");
            System.out.println("2. Count razn.");
            System.out.println("3. Count mult.");
            System.out.println("4. Count div.");
            System.out.println("5. Count factorial.");
            System.out.println("6. Exit.");
            action = scan.nextInt();
            switch(action){
                case 1:{
                    double a,b;
                    System.out.println("Enter first number.");
                    a = scan.nextDouble();
                    System.out.println("Enter second number.");
                    b = scan.nextDouble();
                    System.out.println("Result : " +calq1.countSum(a,b));
                    break;
                }
                case 2:{
                    double a,b;
                    System.out.println("Enter first number.");
                    a = scan.nextDouble();
                    System.out.println("Enter second number.");
                    b = scan.nextDouble();
                    System.out.println("Result : " +calq1.countRazn(a,b));
                    break;
                }
                case 3:{
                    double a,b;
                    System.out.println("Enter first number.");
                    a = scan.nextDouble();
                    System.out.println("Enter second number.");
                    b = scan.nextDouble();
                    System.out.println("Result : " +calq1.countMult(a,b));
                    break;
                }
                case 4:{
                    double a,b;
                    System.out.println("Enter first number.");
                    a = scan.nextDouble();
                    System.out.println("Enter second number.");
                    b = scan.nextDouble();
                    System.out.println("Result : " +calq1.countDiv(a,b));
                    break;
                }
                case 5:{
                    int a;
                    System.out.println("Enter number.");
                    a = scan.nextInt();
                    System.out.println("Result : " +calq1.countfactorial(a));
                    break;
                }
                case 6:{
                    isTrue = false;
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }
}
