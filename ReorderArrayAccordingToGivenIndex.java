/*
 * Rearrange the elements of an array according to given index, Time: O(n), Space: O(1), idea: geeksforgeeks
 */
package reorderarrayaccordingtogivenindex;

import java.util.Arrays;

/**
 *
 * @author rumana aktar
 */
public class ReorderArrayAccordingToGivenIndex {

    /**
     * @param args the command line arguments
     */
    public static int [] reorder(int data[], int index[]){
        for(int i=0; i<data.length; i++){
            
            while(index[i]!=i){
                //save the new position and data 
                int new_i=index[index[i]];
                int new_data=data[index[i]];
                
                //copy current data and index to new position
                index[index[i]]=index[i];
                data[index[i]]=data[i];
                
                //copy the new position data to current index
                index[i]=new_i;
                data[i]=new_data;  
                
            }
        }
        
        System.out.println(Arrays.toString(data));
        return data;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={50,40,70,60,90}, index[]={3,0,4,1,2};
        reorder(num, index);
    }
    
}
