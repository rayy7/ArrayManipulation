/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3waypartitioning;

/**
 *
 * @author md
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void swap(int num[], int x, int y){
        int temp=num[x];
        num[x]=num[y];
        num[y]=temp;
    }
    public static void print(int num[]){
        for(int i=0; i<num.length; i++)
            System.out.print(num[i]+" ");
        System.out.println();
        
    }
    public static void threeWaySort(int num[], int val1, int val2){
        int low=0, high=num.length-1, mid=0;
        while(mid<high){
            if(num[mid]<val1){
                swap(num, low, mid);
                low++;
                mid++;
            }else if(num[mid]>val2){
                while(num[high]>val2)
                    high--;
                swap(num, mid, high);
                high--;
            }else{
                mid++;
            }            
        }
        System.out.println("low index = "+(low-1)+" high index = "+high);
        print(num);
                
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={21,12,3,4,5,9,20,19,5,6,11,32,5};
        threeWaySort(num, 11,20);
    }
    
}
