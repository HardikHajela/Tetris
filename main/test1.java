package main;

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class test1{

    static int width=-1, height=20;

    public static void main(String[] args) {
        //Asking the user to input the demension of Grids
        //has to be positive 
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Kindly enter the width of the Grid:\n***Non-decimal number which ismore than 2, less than 100.***");
                width = sc.nextInt();
                if(width>2 && width<=100){
                    System.out.println("Lets Start the game:"); 
                    break;
                }
            }
            catch(Exception e){
                sc.nextLine();
            }
        }
        sc.close();

        int[][] gameBackEnd = new int[height][width];
        //String [][] c= new String[height][width]; //"■"
        
        setAllToZero(gameBackEnd);
        displayArray(gameBackEnd);

        
    }

    private static void setAllToZero(int arr[][]){
        for (int i = 0; i < height; i++) {
            Arrays.fill(arr[i], 0);
        }
    }
    private static void displayArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j: arr[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    private static void deleteGivenRow(int row) {
        
    }
    private static void name() {
        //int firstInRow; //refer to 2 lines below 
        int count=0, temp;  // count
        for (int i = 0; i < gameBackEnd.length; i++) {
            //firstInRow= gameBackEnd[i][0]; 
            //ONLY applicable if you want to for diff numbers than 1; you may do that to introduce color schemes
            for (int j: gameBackEnd[i]) {
                if(j==1);
                count++;
            }
        }

        if(count==width){
            //delete a row function
        }
    }

} 