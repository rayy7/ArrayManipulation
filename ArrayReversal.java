/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayreversal;

/**
 *
 * @author rumana aktar, idea: geeksforgeeks
 * given an array, num and interger value, d, rotate the array by d elements
 * input: num[]={1,2,3,4,5,6,7,8,9,10,11}, d=3
 * output: num[]={4,5,6,7,8,9,10,11,1,2,3}
 */
public class ArrayReversal {

    /**
     * @param args the command line arguments
     */
    /*rotate array by d elements*/
    //num[]={1,2,3,4,5,6,7,8,9,10,11}, d=3
    public static void rotateArray(int num[], int d){
        reverseArray(num, 0, d-1); printArray(num); //num[]={3,2,1,4,5,6,7,8,9,10,11}
        reverseArray(num, d, num.length-1); printArray(num); //num[]={3,2,1,11,10,9,8,7,6,5,4}
        reverseArray(num, 0, num.length-1); printArray(num); //num[]={4,5,6,7,8,9,10,11,1,2,3}
    }
    
    //revese elements whithin start-end index
    public static void reverseArray(int num[], int start, int end){
        while(start<end){
            int temp=num[start];
            num[start++]=num[end];
            num[end--]=temp;
        }
    }
    
    //print elements of array
    public static void printArray(int num[]){
        System.out.print("\n\nThe array is: ");
        for(int i=0; i<num.length; i++)
            System.out.print(num[i]+"  ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={1,2,3,4,5,6,7,8,9,10,11};
        rotateArray(num, 3);
    }
    
}
