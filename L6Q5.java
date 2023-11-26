/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author jiaqi
 */
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class L6Q5 {
    public static void main(String[] args){        
        ArrayList<Integer> list = getRandom();
        int a = list.get(0), b = list.get(1),c = list.get(2);
        boolean result = multiplication(a,b,c);
        System.out.format("%d x %d = %d%n%B%n", a, b, c, result);
        list.clear();
        list = getRandom();
        a = list.get(0); b = list.get(1);c = list.get(2);
        result = multiplication(a,b,c);
        System.out.format("%d x %d = %d%n", a, b, c);
        System.out.print("True or False? ");
        Scanner sc = new Scanner(System.in);
        boolean answer = sc.nextBoolean();
        if (answer==result)
            System.out.println("Your answer is correct.");
        else 
            System.out.println("Your answer is incorrect.");
    }
    public static ArrayList<Integer> getRandom (){
        HashSet<Integer> set = new HashSet();
        Random rd = new Random();
        while (set.size()<3)
            set.add(rd.nextInt(13));
        ArrayList<Integer> list = new ArrayList<>(set);
        return list;
    }
    public static boolean multiplication(int a, int b, int c){
        return a*b==c;
    }
}
