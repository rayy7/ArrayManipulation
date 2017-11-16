/*
 * Find Index of 0 to be replaced with 1 to get longest continuous sequence of 1s in a binary array
 * Given an array of 0s and 1s, find the position of 0 to be replaced with 1 to get longest continuous 
 * sequence of 1s. Expected time complexity is O(n) and auxiliary space is O(1).
 */
package longetsequenceof1s_replacing_single_0;

/**
 *
 * @author md
 */
public class LongetSequenceOf1s_replacing_single_0 {

    /**
     * @param args the command line arguments
     */
    
    public static void print(int num[]){
        System.out.print("\nNumbers: ");
         for(int i=0; i<num.length; i++)
            System.out.print(num[i]+" ");
    }
    
    public static int indexOf_0(int num[]){
        int max=0,max_index=-1, prev=-1, prev_prev=-1, i;
        for(i=0; i<num.length; i++){
            if(num[i]==0){
                if(prev>=0 && (i-prev_prev-1) > max){
                   max=i-prev_prev-1;
                   max_index=prev;
                }
                System.out.println("max= "+max+" max_index= "+max_index);
                prev_prev=prev;
                prev=i;
            }
        }
        if(i-prev_prev-1 > max){ //accounts for the last '0' index
            max=i-prev_prev-1;
            max_index=prev;
        }
        System.out.print("The max index: "+max_index);
        return max_index;
    }
    
    public static int findIndexOf_0(int num[]){ //time O(n), space O(n)
        int left[]=new int[num.length], right[]=new int[num.length];
        
        for(int i=1; i<num.length; i++){
            if(num[i-1]==0)
                left[i]=0;
            else
                left[i]=left[i-1]+1;
        }
        print(left);
        
        for(int i=num.length-2; i>=0; i--){
            if(num[i+1]==0)
                right[i]=0;
            else
                right[i]=right[i+1]+1;
        }
        print(right);
        
        int max_index=-1, max=0;
        for(int i=0; i<num.length; i++)
            if(left[i]+right[i] > max){
                max=left[i]+right[i];
                max_index=i;
            }
        System.out.println("\nThe desired index is: "+max_index);
        return max_index;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={1,1,1,1,1,1,1,0,0,1,0,1,1,1,0,1,1,1};
        //findIndexOf_0(num);
        print(num);
        indexOf_0(num);
    }
    
}
