package main;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.io.*;

public class test1{

    static int width=-1, height=5; //20

    public static void main(String[] args) {
        //Asking the user to input the demension of Grids
        //has to be positive 
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Kindly enter the width of the Grid:\n***Non-decimal number which is more than 2, less than 100.***");
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
        checkIfRowFilled(gameBackEnd);
        
    }

    private static void setAllToZero(int arr[][]){
        for (int i = 0; i < arr.length-2; i++) {    ////
            Arrays.fill(arr[i], 0);
        }
        Arrays.fill(arr[arr.length-1], 1); Arrays.fill(arr[arr.length-2], 1); ////
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
        //WE HAVE TO DELETE GIVEN ROW AND REPLACE IT WITH THE ABOVE ROWS

        int[][] temp= new int[arr.length][arr[0].length];       //temporary Array

        //doing it for the first element in LL
        int linkedListElement = rows.get(0);

        for(int i=0; i<rows.size(); i++){      //filling the first n colomns w zero that will be removed
            Arrays.fill(temp[i], 0);
        }
        for(int i=rows.size(); i<temp.length; i++){
            for(int j=0; j<arr.length; j++){
                if(!(j==linkedListElement)){
                    System.arraycopy(arr[j], 0, temp[i], 0, temp[i].length);
                    System.out.println("Temp"+i+":"); ////
                    System.out.println(Arrays.toString(temp[i])); ////
                }
            }
        }
        System.out.println("Temp:");
        displayArray(temp); ////
    }
    private static void checkIfRowFilled(int arr[][]) {
        int firstInRow=1; 
        int count=0;  // count for
        LinkedList<Integer> rowsFilled = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            //firstInRow= arr[i][0];  //when firstInRow is any other number than 0 and 1, will be used while assigning color to blocks
            for (int j: arr[i]) {
                if(j==firstInRow) count++;
                else break;
            }
            if(count==arr[i].length) rowsFilled.add(i);
            count=0;
        }

        if(rowsFilled.size()>0){
            System.out.println("Delete called on rows: " + rowsFilled);
            deleteGivenRows(rowsFilled, arr);
        }
    }

} 