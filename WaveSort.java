/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wavesort;

/**
 *
 * @author rumana aktar, idea: geeksforgeeks
 */
public class WaveSort {

    /**
     * @param args the command line arguments
     */
    
    public static void swap(int num[], int x, int y){
        int temp=num[x];
        num[x]=num[y];
        num[y]=temp;
    }
    public static void waveSort(int num[]){
        
        for(int largeIndex=1; largeIndex<num.length; ){
            System.out.println(largeIndex);
            if(num[largeIndex]<num[largeIndex-1])
                swap(num, largeIndex-1, largeIndex);
            if((largeIndex+1 <num.length) && num[largeIndex]<num[largeIndex+1])
                swap(num, largeIndex, largeIndex+1);
            largeIndex=largeIndex+2;
            
        }
        
        printArray(num);
            
    }
     public static void printArray(int num[]){
        System.out.print("\n\nThe array is: ");
        for(int i=0; i<num.length; i++)
            System.out.print(num[i]+"  ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={10,12,2,3,4,5,1,11,23};
        waveSort(num);
    }
    
}
