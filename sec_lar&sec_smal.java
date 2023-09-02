import java.util.Arrays;
public class calDiff
{
	public static void main(String[] args) {
	    int len=6;
	    int[] arr={3,2,1,7,5,4};
	    if(len==0||len<3){
	        System.out.print(0);
	    }
	    int eve_arr[]=new int[len/2];
	    int odd_arr[]=new int[len/2];
	 /declaring index/   int e=0;
	 /*declaring index */  int o=0;
	 for(int i=0;i<len;i++){
	     if(i%2==0){
	         eve_arr[e++]=arr[i];
	         
	     }else{
	         odd_arr[o++]=arr[i];
	     }
	     
	 }
	 Arrays.sort(eve_arr);
	 Arrays.sort(odd_arr);
	 int sec_lar=eve_arr[eve_arr.length-2];
	 int sec_sma=odd_arr[1];
	 System.out.println(sec_lar + sec_sma);
	    
}

}


