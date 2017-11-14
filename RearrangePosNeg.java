/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rearrangeposneg;

/**
 *
 * @author md
 */
public class RearrangePosNeg {

    /**
     * @param args the command line arguments
     */
    
    public static void printArray(int num[]){
        System.out.print("\n\nThe array is: ");
        for(int i=0; i<num.length; i++)
            System.out.print(num[i]+"  ");
    }
    public static void posNegNotInOrder(int num[]){ //O(n) time, O(1) space
        int i=0;
        for(int j=0; j<num.length; j++){
            if(num[j]>0){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                i++;
            }
        }
        printArray(num);
    }
    
    public static void posNegInOrder(int num[]){ //O(n) time, O(n) space
        int temp[]=new int[num.length];
        int j=0;
        for(int i=0; i<num.length; i++){
            if(num[i]>=0)
                temp[j++]=num[i];
        }
        for(int i=0; i<num.length; i++){
            if(num[i]<0)
                temp[j++]=num[i];
        }
        printArray(temp);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={12,-3,4,-4,-6,45,-11,-12,44,87,-8,-10};
        //posNegNotInOrder(num);
        posNegInOrder(num);
        
    }
    
}
