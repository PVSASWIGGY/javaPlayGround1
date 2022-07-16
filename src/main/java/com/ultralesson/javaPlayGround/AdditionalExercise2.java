package com.ultralesson.javaPlayGround;

import java.util.Scanner;

public class AdditionalExercise2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer");
        int num1= sc.nextInt();
        System.out.println("Enter second integer");
        int num2= sc.nextInt();
        System.out.println("Enter third integer");
        int num3= sc.nextInt();
        int result=num1*num2*num3;
        System.out.println("Product is "+result);
    }
}
