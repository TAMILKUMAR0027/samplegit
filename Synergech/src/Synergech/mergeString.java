package Synergech;
import java.util.*;
public class mergeString {
	static String merge(String s1,String s2) {
		return s1+"@"+s2+"gmail";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		String result=merge(s1,s2);
		System.out.print(result);
	}

}
