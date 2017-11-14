/*
 */
package sortanarrayaccordingtoabsdifferencewithx;

/**
 *
 * @author rumana aktar
 */

class Number{
    int val, absDiff;
    Number(int val, int x){this.val=val; absDiff=(val-x)>0? val-x: x-val;}
}

public class SortAnArrayAccordingToAbsDifferenceWithX {

    /**
     * @param args the command line arguments
     */
    
    public static Number [] callMergeSort(Number nums[]){//2:06
        return mergeSort(nums, 0, nums.length-1);
    }
    
    public static Number [] mergeSort(Number num[], int low, int high){        
        if(low<high){
            int mid=(low+high)/2;
            num=mergeSort(num, low, mid);             
            num=mergeSort(num, mid+1, high);
            num=merge(num, low, mid, high);
        }
        return num;
    }
    
    public static Number [] merge(Number num[], int low, int mid, int high){
        //System.out.println("low="+low+" mid="+mid+" high="+high);
        Number lowArray[]=new Number[mid-low+1], highArray[]=new Number[high-mid];
        int low2=low;
        
        for(int i=0; i<lowArray.length; i++){
            lowArray[i]=num[low++];
        }                
        for(int i=0; i<highArray.length; i++){
            highArray[i]=num[++mid];
        }
        
        int i=0, j=0, k=low2;
        while(i<lowArray.length && j<highArray.length){
            if(lowArray[i].absDiff<highArray[j].absDiff){
                num[k++]=lowArray[i++];
            }else
                num[k++]=highArray[j++];
        }
        
        while(i<lowArray.length){
            num[k++]=lowArray[i++];
        }
        
        while(j<highArray.length){
            num[k++]=highArray[j++];
        }
            
        return num;
    }
    
    public static void sortAbsDiff(int num[], int x){
        Number nums[]=new Number[num.length];
        
        //generate a data structure with val and absDiff as abs(val-x)
        for(int i=0; i<nums.length; i++){
            nums[i]=new Number(num[i], x);
        }    
        
        //apply mergersort on the data structure; its nlog(n)
        callMergeSort(nums);
        
        //print absolute difference
        for(int k=0; k<nums.length; k++){
            System.out.print(nums[k].absDiff+" ");
        }System.out.println();  
        
        //print originak difference
        for(int k=0; k<nums.length; k++){
            System.out.print(nums[k].val+" ");
        }System.out.println();  
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={10, 5, 3, 9, 2}, x=7;
        sortAbsDiff(num, x);
        
    }
    
}
