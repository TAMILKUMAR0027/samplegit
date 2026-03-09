package Synergech;
import java.util.*;
public class SortedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		for(int i=1;i<st.length();i++) {
			char c=st.charAt(i);
			if(!(c-'0'>=st.charAt(i-1)-'0')) {
				System.out.print("Unsorted");
				return;
			}
		}
		System.out.print("Sorted");
	}

}
