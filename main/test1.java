package main;

import java.util.Scanner;
import java.util.Optional;
import java.io.*;

public class test1{
    public static void main(String[] args) {
        //Asking the user to input the demension of Grids
        //has to be positive 
        Scanner sc = new Scanner(System.in);
        int width=-1, height=20;
        while(true){
            try{
                System.out.println("Kindly enter the width of the Grid):");
                width = sc.nextInt();
                if(width>0 && width<=10000){
                    System.out.println("Lets Start the game:"); 
                    break;
                }
            }
            catch(Exception e){
                //System.out.println("Kindly Enter a the dimentions of the grid:");
                sc.nextLine();
            }
        }
        sc.close();

        int[][] gameBackEnd = new int[width][height];
        //String [][] c= new String[width][height];
    }
} 