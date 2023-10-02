import java.util.*;
public class reverseString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        String reverse="";
        String[] s1=s.split("\\.");
        for(int i=s1.length-1;i>=0;i--){            
            reverse+=s1[i];            
        if(i>0){
           reverse+=".";
        }        
    } System.out.println(reverse);
        
    }
}
