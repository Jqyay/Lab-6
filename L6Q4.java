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
public class L6Q4 {
    public static void main(String[] args){
        int GDC = GDC(24, 8);
        System.out.format("The greatest common divisor of %d and %d is %d%n", 24, 8, GDC);
        GDC = GDC(200, 625);
        System.out.format("The greatest common divisor of %d and %d is %d", 200, 625, GDC);
    }
    public static int GDC(int a, int b){
        ArrayList<Integer> remainder= new ArrayList();
        int i=1;
        remainder.add(a%b);
        remainder.add(b%a);
        for (;remainder.get(i)!=0;i++){
            remainder.add(remainder.get(i-1)%remainder.get(i));
        }
        return remainder.get(i-1);        
    }
}
