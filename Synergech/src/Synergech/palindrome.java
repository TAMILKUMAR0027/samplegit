package Synergech;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
		        String s=sc.nextLine();int k=0;
		        char[]a=s.toCharArray();
		        int l=0,r=s.length()-1;
		        while(l<r){
		            if(a[l]==' '){
		                a[l]=a[r];
		            }else if(a[r]==' '){
		                a[r]=a[l];
		            }else{
		                l++;
		                r--;
		            }
		        }
		        System.out.print(new String(a));
			
		
	}

}
