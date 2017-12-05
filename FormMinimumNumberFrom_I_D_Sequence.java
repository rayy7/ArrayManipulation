/*
 * get the minimum number from a sequence indicating Increasing and Decreasing
 * digits should be unique and between [1-9]
 * idea: geeksforgeeks
 */
package formminimumnumberfrom_i_d_sequence;
import java.util.Arrays;
import java.util.Vector;
/**
 *
 * @author rumana aktar
 */
public class FormMinimumNumberFrom_I_D_Sequence {

    /**
     * @param args the command line arguments
     */
    
    
    public static Vector getMinimumNumber(String str){
        Vector num=new Vector();
        int leftmost_I=0, nextMin;
        
        if(str.charAt(0)=='I'){
            num.add(1);num.add(2);
            leftmost_I=1;
        }else{
            num.add(2); num.add(1);
        }
        nextMin=3;
        
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)=='I'){ //if I, then just append the next minimum number
                num.add(nextMin++);
                leftmost_I=i+1;
            }
            else{ //if decreasing, append the last index output at output and increase every number between index i and leftmost_I
                num.add(num.get(i));
                int j=i;
                while(j>=leftmost_I){
                    num.set(j, (int)num.get(j)+1);
                    j--;
                }
                nextMin++;
            }                        
        }
        
        for(int i=0; i<num.size(); i++)
            System.out.print(num.get(i));
        return num;
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        getMinimumNumber("DDIDDIID");
    }
    
}
