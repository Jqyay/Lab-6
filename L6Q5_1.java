/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author jiaqi
 */
import java.util.Random;
import java.util.Scanner;
public class L6Q5_1 {
    public static void main(String[] args){        
        Random rd = new Random();
        int i=0, score=0;
        while(i>=0){
            int a = rd.nextInt(13), b = rd.nextInt(13);
            System.out.format("%nEnter negative number to quit.%n%d x %d = ", a, b);
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();i=c;
            boolean answer = multiplication(a,b,c);
            if (answer){
                System.out.println("Your answer is correct.");
                score++;
            }
            else 
                System.out.println("Your answer is incorrect.");
        }
        System.out.println("\nYour score is "+ score);
    }
    public static boolean multiplication(int a, int b, int c){
        return a*b==c;
    }
}
