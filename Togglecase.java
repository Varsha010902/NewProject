import java.util.Scanner;
public class Togglecase{
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
