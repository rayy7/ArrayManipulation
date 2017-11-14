/*
 * http://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsumwithrotation;

/**
 *
 * @author rumana aktar, idea: geeksforgeeks
 */
public class MaxSumWithRotation {

    /**
     * @param args the command line arguments
     */
    
    //get maxmum sum of an array when each element is multiplied by its index
    public static int getMaxSumWithRotation(int num[]){
        int arrSum=0, indexSum=0, maxSum, rotation=0;
        for(int i=0; i<num.length; i++){
            arrSum+=num[i];
            indexSum+=i*num[i];
        }
        maxSum=indexSum;
        
        //try rotation
        for(int i=1; i<num.length; i++){
            indexSum=indexSum+arrSum-num.length*num[num.length-i]; //formula
            if(indexSum>maxSum){
                maxSum=indexSum;
                rotation=i;
            }
        }        
        return maxSum;
    }    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={23,40,6,8,3,67,24,21,20};
        getMaxSumWithRotation(num);
        
    }
    
}
