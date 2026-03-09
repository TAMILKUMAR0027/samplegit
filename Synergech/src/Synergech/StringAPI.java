package Synergech;
import java.util.*;
public class StringAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		st.toUpperCase();
		System.out.println(st);
		System.out.println(st.length());
		System.out.println(st.substring(2,4));
		System.out.print(st.charAt(0));
	}

}
