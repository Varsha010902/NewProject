/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		boolean flag=false;
		int key=4;
		int l=0;
		int h=a.length-1;
		while(l<=h){
		    int m=(l+h)/2;
		    if(a[m]==key){
		        System.out.println("Element found");
		        System.out.println(m);
		        
		        flag=true;
		        break;
		    }
		    if(a[m]<=key){
		        l=m+1;
		    }
		    if(a[m]>=key){
		        h=m-1;
		    }
		        
		}
		if(flag==false){
		    System.out.println("Element not found");
		}
	}
}
