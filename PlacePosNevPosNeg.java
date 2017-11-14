/* Rearrange positive and negative numbers in O(n) time and O(1) extra space
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placeposnevposneg;

/**
 *
 * @author rumana aktar, idea: geeksforgeeks
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
    
    
    public static void rearrangePosNegPosNeg(int num[]){
        
        //partition around 0:  -1  -2  -4  -5  -7  -8  4  5  6  7  
        int i=0;
        for(int j=0; j<num.length; j++){
            if(num[j]<0){
                swap(num, i, j);
                i++;
            }
        }
        
        //for each positive number, replace with alternative negai=tives
        //4  -2  5  -5  6  -8  7  -4  -7  -1
        int j=0;
        for(i=0; i<num.length; i++){
            if(j>i)
                break;
            if(num[i]>0){
                swap(num, i, j);
                j=j+2;               
            }
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={-1,-2,-4,-5,-7,-8,4, 5,6 ,7};
        rearrangePosNegPosNeg(num); //4  -2  5  -5  6  -8  7  -4  -7  -1
    }
    
}
