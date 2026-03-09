package Synergech;
import java.util.*;
public class longnumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int[] fr=new int[10];
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			fr[c-'0']++;
		}
		for(int i=0;i<10;i++) {
			if(fr[i]>0) {
				System.out.println(i+" : "+fr[i]);
			}
		}
	}

}
