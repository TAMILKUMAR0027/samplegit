package Synergech;
import java.util.*;
public class StringUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		String[] arr=st.split(" ");
		for(int i=0;i<arr.length;i++) {
			String first=arr[i].substring(0,1).toUpperCase();
            String rest=arr[i].substring(1);
            System.out.print(first+rest+" ");
		}
	}

}
