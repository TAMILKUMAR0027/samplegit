package Synergech;
import java.util.*;
public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		char[]a=st.toCharArray();
		HashMap<Character,Integer>as=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			as.put(a[i],as.getOrDefault(a[i], 0) + 1);
		}
		int odd=0;
		for(int i=0;i<as.size();i++) {
			if(as.get(a[i])%2!=0) {
				odd++;
			}
		}
		if(odd>1) {
			System.out.print("False");
		}else {
			System.out.print("True");
		}
	}

}
