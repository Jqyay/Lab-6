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
public class L6Q3 {
    public static void main(String[] args){
        Random rd = new Random();
        int[] integer= new int[10];
        for (int i =0; i<10;i++){
            int randomN = rd.nextInt();
            integer[i] = (randomN>=0)?randomN:randomN*(-1);
        }
        System.out.println("Before reversed: ");
        for (int i : integer)
            System.out.print(i+" ");
        int[] reversed = reverse(integer);
        System.out.println("\nAfter reversed: ");
        for (int i:reversed)
            System.out.print(i+" ");
    }
    public static int[] reverse(int [] a){
        int[] temp = new int[10];
        for(int i=9;i>=0;i--)
            temp[i] = a[9-i];
        return temp;
    }
}
