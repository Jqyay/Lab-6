/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author jiaqi
 */
import java.util.ArrayList;
import java.util.Random;
public class tuto6 {
    public static void main(String[] args){
        int max = getMax(1,2,-3);
        System.out.println(max);
        pentagonal(5);
        SquareOrNot(25);
        letterDigit("I am a 20-year-old student.");
        int[] randomNum = generateNum();
        for(int i : randomNum)
            System.out.print(i+" ");
        System.out.println();
        double[] circle = circle(9);
        int j=0;
        for (double i: circle){
            System.out.format("%s of circle with radius 9 is %.2f%n",((j==0)?"Area":"Circumference"),i);
            j++;
        }
        System.out.println("First random number generated twice is "+twice());
        decreasing(11,1,20);
    }
    public static int getMax(int a, int b, int c){	
        int max = a;
        if (b>max)
            max = b;
        if (c>max)
            max = c;
        return max;
    }
    public static void pentagonal(int n){
        int yes = 0;
        for (int i=0;i<=n;i++){
        int pentagonal= i*(3*i-1)/2;
            if (pentagonal==n){
                    System.out.println("The number is a pentagonal number.");
                    yes++;
                    break;
            }
        }
        if (yes==0)
                System.out.println("The number is not a pentagonal number.");
    }
    public static void SquareOrNot(int num){
        int k=0;	
        for (int i=0;i<=Math.sqrt(num);i++){
            if(num==i*i){
                System.out.println("The integer is a square number.");
                k++;
                break;
            }
        }
        if (k==0)
            System.out.println("The integer is not a square number.");
    }
    public static void letterDigit(String a){
	int letter =0, digit =0;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)>=48&&a.charAt(i)<=57)
		digit++;
            else if ((a.charAt(i)>=65&&a.charAt(i)<=90)||(a.charAt(i)>=97&&a.charAt(i)<=122))
		letter++;               
        }
        System.out.println("Number of digits is "+ digit);
        System.out.println("Number of letters is "+ letter);
    }
    public static int[] generateNum(){
        Random rand = new Random();
        int [] rd = new int[10];
        for (int i=0;i<10;i++)
            rd[i] = rand.nextInt(101);	
        return rd;
    }
    public static double[] circle(int radius){
        double [] circle = new double[2];
        circle[0]  = Math.PI * radius*radius;
        circle[1] = Math.PI * 2 * radius;
        return circle;
    }
    public static int twice(){
        ArrayList<Integer> arr = new ArrayList();
        Random rd = new Random();
        arr.add(rd.nextInt(11));
        int j =1;
        while (true){
            System.out.format("Round %d%nArray Element: ", j);
            int num = rd.nextInt(11);
            for (int i: arr)
                System.out.print(i + " ");
            System.out.println();
            for (int i=0;i<arr.size();i++){
                if (arr.get(i)==num){
                    System.out.format("Round %d%nArray Element: ", ++j);
                    for (int k: arr)
                        System.out.print(k + " ");
                    System.out.println(arr.get(i));
                    return arr.get(i);
                }
            }
            arr.add(num);
            j++;
        }
    }
    public static void decreasing(int a, int b, int c){
        int min=a, sum=a+b+c, max=a;
        if(b<min)
            min = b;
        else if (b>max)
            max =b;
        if(c<min)
            min = c;
        else if (c>max)
            max =c;
        System.out.format("%d, %d, %d", max, (sum-min-max), min);
    }

}
