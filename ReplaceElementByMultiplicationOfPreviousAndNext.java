/*
 * Replace every element by the multiplicatiuon of previous and next element, time: O(n), space: O(1)
 */
package replaceelementbymultiplicationofpreviousandnext;

import java.util.Arrays;

/**
 *
 * @author rumana aktar
 */
public class ReplaceElementByMultiplicationOfPreviousAndNext {

    /**
     * @param args the command line arguments
     */
    
    public static int[] replaceElement(int num[]){
        int prev=num[0], cur;
        for(int i=0; i<num.length-1; i++){
            cur=num[i];
            num[i]=prev*num[i+1];
            prev=cur;
        }
        num[num.length-1]=prev*num[num.length-1];
        System.out.println(Arrays.toString(num));
        return num;    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={2,3,4,5,7,8,11};
        replaceElement(num);
    }
    
}
