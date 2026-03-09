package Synergech;
import java.util.*;
public class StringWithVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		String[] arr=st.split(" ");
		for(int i=0;i<arr.length;i++) {
			String r=arr[i].toLowerCase();
			if(r.charAt(0)=='a'||r.charAt(0)=='e'||r.charAt(0)=='o'||r.charAt(0)=='i'||r.charAt(0)=='u') {
				System.out.print(arr[i]);
			}else {
				continue;
			}
		}
	
	}

}
