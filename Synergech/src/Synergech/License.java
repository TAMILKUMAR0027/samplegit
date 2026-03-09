package Synergech;
import java.util.*;
public class License {  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		
		if(!((s1.charAt(0)>='A'&&s1.charAt(0)<='Z')&&(s1.charAt(1)>='A'&&s1.charAt(1)<='Z'))) {
			System.out.print("Invalid");
			return;
		}
		for(int i=3;i<s1.length()-1;i++) {
			char c=s1.charAt(i);
			if(c==s1.charAt(i+1)) {System.out.print("Invalid");
			return;}
		}
		System.out.print("valid");
	}
}
