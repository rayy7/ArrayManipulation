/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort000s1111s;

/**
 *
 * @author md
 */
public class Sort000s1111s {

    /**
     * @param args the command line arguments
     */
    public static void swap(int num[], int low, int high){
        int temp=num[low];
        num[low]=num[high];
        num[high]=temp;
    }
    
    public static void sort000s111s(int num[]){
        int low=0, high=num.length-1;
        while(low<high){
            if(num[low]==0)
                low++;
            else{
                while(high>=0 && num[high]==1)
                    high--;                
                if(low>=high)
                    break;
                swap(num, low, high);
                low++;high--;
            }
                
        }
        for(int i=0; i<num.length; i++)
            System.out.print(num[i]+" ");
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={0,0,0,1,1,1,0,1};
        sort000s111s(num);
    }
    
}
