import java.util.*;
class ReverseString
{
    public static void main(String[]args){
        String str="Varsha Swathi";
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr=revStr+str.charAt(i);
        }
        System.out.println("OriginalString:"+str);
        System.out.println("ReversedString:"+revStr);
    } 
}
    
