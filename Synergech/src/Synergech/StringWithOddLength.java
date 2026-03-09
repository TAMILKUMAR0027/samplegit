package Synergech;
import java.util.*;
public class StringWithOddLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		String[] arr=st.split(" ");
		for(int i=0;i<arr.length;i++) {
			String r=arr[i];
			if(r.length()%2!=0) {
				System.out.print(r+" ");
			}
		}
	}

}
