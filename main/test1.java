package main;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
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
        for (int i = 0; i < arr.length; i++) {
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
    private static void deleteGivenRows(LinkedList<Integer> rows, int arr[][]) {
        
    }
    private static void checkIfRowFilled(int arr[][]) {
        int firstInRow=1; 
        int count=0;  // count for
        LinkedList<Integer> rowsFilled = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            //firstInRow= arr[i][0];  //when firstInRow is any other number than 0 and 1, will be used while assigning color to blocks
            for (int j: arr[i]) {
                if(j==firstInRow) count++;
            }
            if(count==arr.length) rowsFilled.add(i);
        }

        if(rowsFilled.size()>0){
            deleteGivenRows(rowsFilled, arr);
        }
    }

} 