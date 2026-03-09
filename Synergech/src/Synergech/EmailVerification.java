package Synergech;
import java.util.*;
public class EmailVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		if(!(st.charAt(0)>='a'&&st.charAt(0)<='z')) {
			System.out.print("Invalid");
			return;
		}
		if(!(st.substring(st.length()-4).equals(".com"))) {
			System.out.print("Invalid");
			return;
		}
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
			if(c=='@') {
				if(!(st.charAt(i+1)>='a'&&st.charAt(i+1)<='z')) {
					System.out.print("Invalid");return ;
				}
			}
		}System.out.print("Valid");
	}

}
