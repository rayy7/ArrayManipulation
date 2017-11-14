/* for every odd index, num[odd-1]<num[odd] && num[odd+1]<num[odd]
 * input:  10,  12,  2,  3,  4,  5,  1,  11, 23
 * output: 10,  12,  2,  4,  3,  5,  1,  23,  11 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wavesort;

/**
 *
 * @author rumana aktar, idea: geeksforgeeks
 */
public class WaveSort {

    /**
     * @param args the command line arguments
     */
    
    //swap elements
    public static void swap(int num[], int x, int y){
        int temp=num[x];
        num[x]=num[y];
        num[y]=temp;
    }
    //for every odd index, num[odd-1]<num[odd] && num[odd+1]<num[odd]
    public static void waveSort(int num[]){        
        for(int largeIndex=1; largeIndex<num.length; ){
            if(num[largeIndex]<num[largeIndex-1]) //check previous element
                swap(num, largeIndex-1, largeIndex);
            if((largeIndex+1 <num.length) && num[largeIndex]<num[largeIndex+1]) //check next elemet
                swap(num, largeIndex, largeIndex+1);
            largeIndex=largeIndex+2;            
        }
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]={10,12,2,3,4,5,1,11,23};
        waveSort(num); // 10  12  2  4  3  5  1  23  11 
    }
    
}
