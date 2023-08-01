/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int start=0;
        int end=n-1;
        System.out.println(palindrome(str,start,end));
        
    }
    static int palindrome(String str,int start,int end){
        if(start>end){
            return 1;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return 0;
        }
        return palindrome(str,start+1,end-1);
    }
}