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
        char arr[]=str.toCharArray();
        String res="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65&&arr[i]<=90){
                arr[i]+=32;
            }
            else if(arr[i]>=97&&arr[i]<=122){
                 arr[i]-=32;
            }
            res+=arr[i];
        }System.out.println(res);
    }
}
