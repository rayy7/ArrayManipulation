/*
 * http://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsumwithrotation;

/**
 *
 * @author md
 */
public class MaxSumWithRotation {

    /**
     * @param args the command line arguments
     */
    
    public static int getMaxSumWithRotation(int num[]){
        int arrSum=0, indexSum=0, maxSum, rotation=0;
        for(int i=0; i<num.length; i++){
            arrSum+=num[i];
            indexSum+=i*num[i];
        }
        maxSum=indexSum;
        
        //try rotation
        for(int i=1; i<num.length; i++){
            indexSum=indexSum+arrSum-num.length*num[num.length-i];
            if(indexSum>maxSum){
                maxSum=indexSum;
                rotation=i;
            }
        }
        printArray(num);
        System.out.println("\nThe maximum indexSum obtained: "+maxSum+" ..... with rotation: "+rotation);
        rotateArray(num, rotation);
        printArray(num);
        return maxSum;
    }
    
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
        int num[]={23,40,6,8,3,67,24,21,20};
        getMaxSumWithRotation(num);
        
    }
    
}
