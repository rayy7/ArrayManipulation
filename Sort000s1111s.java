/*
 * sort an array consists of 0's and 1's only: time: O(n), Space: O(1)
 * input: 0,0,0,1,1,1,0,1
 * output: 0,0,0,0,1,1,1,1
 */
package sort000s1111s;

/**
 *
 * @author rumana aktar
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
            if(num[low]==0) //if it is 0, keep going
                low++;
            else{
                while(high>=0 && num[high]==1) //if it is 1, replace with the first zero from end
                    high--;                
                if(low>=high)
                    break;
                swap(num, low, high);
                low++;high--;
            }                
        }        
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={0,0,0,1,1,1,0,1};
        sort000s111s(num);
    }
    
}
