import java.util.Scanner;
public class countWords
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a String:");
	    String str=sc.nextLine();
	    int countWords=str.split("\\s").length;
	    System.out.println("countWords:"+countWords);

	}
}
