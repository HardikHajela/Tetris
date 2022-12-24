package main;

import java.util.Scanner;
import java.util.Optional;
import java.io.*;

public class test1{
    public static void main(String[] args) {
        //Asking the user to input the demension of Grids
        //has to be positive 
        Scanner sc = new Scanner(System.in);
        int x,y;
        while(true){
            try{
                System.out.println("Kindly Enter the dimentions of the grid(positive and numeric):");
                x = sc.nextInt();
                y = sc.nextInt();
                break;
            }
            catch(Exception e){
                //System.out.println("Kindly Enter a the dimentions of the grid:");
                sc.nextLine();
            }
        }
        sc.close();
    }
} 