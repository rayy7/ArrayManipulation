/*
 * geeksforgeeks: Given a binary string s and two integers x and y are given. Task is to arrange the given string in such 
 * a way so that ‘0’ comes X-time then ‘1’ comes Y-time and so on until one of the ‘0’ or ‘1’ is finished. 
 * Then concatenate rest of the string and print the final string.
 * Given : x or y can not be 0
 */
package rearrangestringas_x_y_occurances;

/**
 *
 * @author rumanaaktar, 12/6/17
 */
public class RearrangeStringAs_x_y_occurances {

    /**
     * @param args the command line arguments
     */
    
    public static String getMiniStr(int length, char ch){
        String str="";
        while(length>=1){
            str+=ch;
            length--;
        }
        return str;
    }
    
    public static String rearrnage(String str, int x, int y){
        int cx=0, cy=0;
        String res="";
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='0')
                cx++;
            else
                cy++;
        }
        
        while(cx>=0 && cy>=0){
            if(cx>=x){
                res+=getMiniStr(x, '0');
                cx-=x;
            }else{
                res+=getMiniStr(cx, '0');
                res+=getMiniStr(cy, '1');
                break;
            }
            
            if(cy>=y){
                res+=getMiniStr(y, '1');
                cy-=y;
            }else{
                res+=getMiniStr(cy, '1');
                res+=getMiniStr(cx, '0');
                break;
            }
        }    
        System.out.println(res);
        return res;
    
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //getMiniStr(3, '1');
        rearrnage("0111111010001", 2, 1);
    }
    
}
