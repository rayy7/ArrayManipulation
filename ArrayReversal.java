/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayreversal;

/**
 *
 * @author rumana aktar
 */
public class ArrayReversal {

    /**
     * @param args the command line arguments
     */
    /*rotate array by d elements*/
    public static void rotateArray(int num[], int d){
        reverseArray(num, 0, d-1); printArray(num);
        reverseArray(num, d, num.length-1); printArray(num);
        reverseArray(num, 0, num.length-1); printArray(num);
    }
    
    public static void reverseArray(int num[], int start, int end){
        while(start<end){
            int temp=num[start];
            num[start++]=num[end];
            num[end--]=temp;
        }
    }
    public static void printArray(int num[]){
        System.out.print("\n\nThe array is: ");
        for(int i=0; i<num.length; i++)
            System.out.print(num[i]+"  ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={1,2,3,4,5,6,7,8,9,10,11};
        //reverseArray(num, 0, num.length-1); printArray(num);
        rotateArray(num, 3);
        rotateArray(num, num.length-3);
    }
    
}
