import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
	    int rev_num=0;
	    while(number!=0){
	    
	    int digit=number%10;
	    rev_num=rev_num*10+digit;
	    number/=10;
	    }
	    
	    System.out.println(rev_num);
	    
		
	}
}
