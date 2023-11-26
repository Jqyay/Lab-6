/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author jiaqi
 */
public class L6Q6 {
    public static void main(String[] args){
        for (int i=0;i<2;i++){
            System.out.format("%s%n",(i==0)?"First 20 palindroic prime":"First 20 emirps");
            for (int j=2, p=0;p<20;j++){
                if((i==0)?palindromicPrime(j):emirp(j)){
                    System.out.print(j+" ");
                    p++;
                }
            }
            System.out.println();
        }
    }
    public static boolean palindromicPrime(int i){
        if (!Prime(i))
            return false;        
        for (int j=2;j<=Math.sqrt(i);j++){
            if (i%j==0)
                return false;
                }
            if (i>9&&i<100){
                if (i%10!=i/10)
                    return false;
            }
            else{
                String a = String.valueOf(i);
                for (int j=0;j<a.length()/2;j++){
                    if (a.charAt(j)!=a.charAt(a.length()-1-j))
                        return false;
                }
            }
            return true;       
    }
    public static boolean Prime(int i){
        for (int j=2;j<=Math.sqrt(i);j++){
            if (i%j==0)
                return false;
        }
        return true;
    }
    public static boolean emirp(int i){
        if (!Prime(i))
            return false;        
        if (palindromicPrime(i))
            return false;        
        String a = String.valueOf(i),b="";
        for (int j=0;j<a.length();j++)
            b+=a.charAt(a.length()-1-j);
        int reversed = Integer.valueOf(b);
        if (!Prime(reversed))
            return false;
        return true;
    }
}
