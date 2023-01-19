package com.automation.steps;
import java.util.Scanner;
public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number between 0 and 165");
        int s =sc.nextInt();
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(i==j||i+j==s-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
