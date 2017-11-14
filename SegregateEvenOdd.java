/*
 * Segregate even and odd numbers: time o(n), space O(1)
 * input: 12,34,5,6,7,23,45,67,89,1
 * output: 12, 34, 6, 5, 7, 23, 45, 67, 89, 1
 */
package segregateevenodd;

/**
 *
 * @author rumana aktar
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
            if(num[low]%2==0) //if it is even, keep going
                low++;
            else{
                while(high>=0 && num[high]%2==1) //if it is odd, swap with the first even from end
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
        int num[]={12,34,5,6,7,23,45,67,89,1};
        segregateEvenOdd(num);
    }
    
}
