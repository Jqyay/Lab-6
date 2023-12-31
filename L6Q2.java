/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author jiaqi
 */
import java.util.Scanner;
public class L6Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character that you want to print: ");
        char c = sc.next().charAt(0);
        System.out.print("Enter how many times you want the character to be printed: ");
        int n= sc.nextInt();
        System.out.println();
        multiPrint(n,c);
        
        System.out.print("\nEnter the number of rows of triangle: ");
        int rowTri = sc.nextInt();
        triangle(rowTri, c);
        
        System.out.print("\nEnter the number of rows of diamond: ");
        int rowDia = sc.nextInt();
        triangle((int)(Math.round(rowDia/2.0)),c);
        for (int i=(int)(Math.round(rowDia/2.0)-1);i>=1;i--){
            System.out.format("%"+((Math.round(rowDia/2.0)+(Math.round(rowDia/2.0)+1)-i-(i-1))/2)+"s", "");
            multiPrint(i,c);
        }
    }
    public static void multiPrint(int n, char c){
        for (int i=0; i<n;i++)
            System.out.print( c+" ");
        System.out.println();
    }
    public static void triangle(int rowTri, char c){
        System.out.println();
        for (int i=1;i<=rowTri;i++){
            System.out.format("%"+((i==rowTri)?1:(rowTri+(rowTri+1)-i-(i-1))/2)+"s", "");
            multiPrint(i,c);
        }
    }
}
