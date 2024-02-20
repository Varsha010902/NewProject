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
/////////////////////////////////////////////////////////////
#using stringmanipulation

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str="varsha";
	    StringBuilder rev=new StringBuilder(str).reverse();
	    System.out.print(rev);		
	}
}
    
