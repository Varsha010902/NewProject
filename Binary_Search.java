import java.util.*;
public class BinarySearch
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
