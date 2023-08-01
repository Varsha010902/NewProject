import java.util.Scanner;
public class Palindrome{
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
