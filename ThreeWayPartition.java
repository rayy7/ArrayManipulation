/*
 * Three way partitioning of an array around a given range
    Given an array and a range [lowVal, highVal], partition the array around the range such that array is divided in three parts.
        1) All elements smaller than lowVal come first.
        2) All elements in range lowVal to highVVal come next.
        3) All elements greater than highVVal appear in the end.
    The individual elements of three sets can appear in any order.
    
    input: num[]={21,12,3,4,5,9,20,19,5,6,11,32,5}, val1=11, val2=20
    output: []={5, 3, 4, 5, 9, 5, 6, 19, 12, 20, 11, 32, 21 }
 */
package pkg3waypartitioning;

/**
 *
 * @author rumana aktar, idea: geeksforgeeks
 */
public class ThreeWayPartition {

    /**
     * @param args the command line arguments
     */
    public static void swap(int num[], int x, int y){
        int temp=num[x];
        num[x]=num[y];
        num[y]=temp;
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
        //num[0...(low-1)]<val1, val1>=num[low...high-1]<=val2, num[high...num.length-1]>high
        System.out.println("low index = "+(low-1)+" high index = "+high);        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={21,12,3,4,5,9,20,19,5,6,11,32,5};
        threeWaySort(num, 11,20);
    }
    
}
