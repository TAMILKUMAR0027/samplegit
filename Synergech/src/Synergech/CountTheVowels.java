package Synergech;
import java.util.*;
public class CountTheVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		int k=0;
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')k++;
		}
		System.out.print(k);
	}

}
