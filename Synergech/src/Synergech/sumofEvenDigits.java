package Synergech;
import java.util.*;
public class sumofEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		int sum=0;
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
			if((c-'0')%2==0) {
				sum+=(c-'0');
			}
		}
		System.out.print(sum);
	}

}
