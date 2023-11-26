/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author jiaqi
 */
public class L6Q1 {
    public static void main(String[] args){
        triangular();
    }
    public static void triangular(){
        for (int i=1;i<=20;i++){
            int triangular =0;
            for (int p=1;p<=i;p++){
                triangular+=p;
            }
            System.out.print(triangular+" ");
        }
    }
}
