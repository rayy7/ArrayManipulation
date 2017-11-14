/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placeposnevposneg;

/**
 *
 * @author md
 */
public class PlacePosNevPosNeg {

    /**
     * @param args the command line arguments
     */
    
    
    public static void swap(int num[], int x, int y){
        int temp=num[x];
        num[x]=num[y];
        num[y]=temp;
    }
    
    public static void printArray(int num[]){
        System.out.print("\n\nThe array is: ");
        for(int i=0; i<num.length; i++)
            System.out.print(num[i]+"  ");
    }
    
    public static void rearrangePosNegPosNeg(int num[]){
        int i=0;
        for(int j=0; j<num.length; j++){
            if(num[j]<0){
                swap(num, i, j);
                i++;
            }
        }
        printArray(num);
        
        int j=0;
        for(i=0; i<num.length; i++){
            if(j>i)
                break;
            if(num[i]>0){
                swap(num, i, j);
                j=j+2;               
            }
        }
        printArray(num);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={-1,-2,-4,-5,-7,-8,4, 5,6 ,7};
        rearrangePosNegPosNeg(num);
    }
    
}
