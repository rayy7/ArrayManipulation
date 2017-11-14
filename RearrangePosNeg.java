/*
 * input: num[]={12,-3,4,-4,-6,45,-11,-12,44,87,-8,-10};
 * output: {12,4,45,44,87,-3,-4,-6,-11,-12,-8,-10}
 */
package rearrangeposneg;

/**
 *
 * @author rumana aktar, idea: geeksforgeeks
 */
public class RearrangePosNeg {

    /**
     * @param args the command line arguments
     */
    
    
    public static int [] posNegNotInOrder(int num[]){ //O(n) time, O(1) space
        int i=0;
        for(int j=0; j<num.length; j++){
            if(num[j]>0){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                i++;
            }
        }
        return num;
    }
    
    public static int [] posNegInOrder(int num[]){ //O(n) time, O(n) space
        int temp[]=new int[num.length];
        int j=0;
        for(int i=0; i<num.length; i++){
            if(num[i]>=0)
                temp[j++]=num[i];
        }
        for(int i=0; i<num.length; i++){
            if(num[i]<0)
                temp[j++]=num[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={12,-3,4,-4,-6,45,-11,-12,44,87,-8,-10};
        //posNegNotInOrder(num);
        posNegInOrder(num);
        
    }
    
}
