package Synergech;
import java.util.*;
public class StringIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine().toUpperCase();
		for(int i=0;i<st.length();i++) {
			System.out.println(st.charAt(i));
		}
	}

}
