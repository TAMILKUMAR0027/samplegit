package Synergech;
import java.util.*;
public class FindAndReplaceCaseSensitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		String s1=s.nextLine();
		String s2=s.nextLine();
		String[]a=st.split(" ");
		if(s1.contains(st)) {
			for(int i=0;i<a.length;i++) {
			if(a[i].equals(s1)) {
				a[i]=s2;
			}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
