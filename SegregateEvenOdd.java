/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segregateevenodd;

/**
 *
 * @author md
 */
public class SegregateEvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void swap(int num[], int low, int high){
        int temp=num[low];
        num[low]=num[high];
        num[high]=temp;
    }
    
    public static void segregateEvenOdd(int num[]){
        int low=0, high=num.length-1;
        while(low<high){
            if(num[low]%2==0)
                low++;
            else{
                while(high>=0 && num[high]%2==1)
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
        int num[]={12,34,5,6,7,23,45,67,89,1};
        segregateEvenOdd(num);
    }
    
}
