/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
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
