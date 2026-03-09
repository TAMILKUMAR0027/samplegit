package Synergech;
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		StringBuilder a=new StringBuilder(st);
		if(st.length()%2!=0) {
			System.out.print(a.reverse());
		}else {
			System.out.print(st);
		}
		
	}

}
