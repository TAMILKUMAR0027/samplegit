package Synergech;
import java.util.*;
public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char[]a=(String.valueOf(n)).toCharArray();
		boolean k=true;
		for(int i=0;i<a.length;i++) {
			if(a[i]!='3'&&a[i]!='4') {
				k=false;
				break;
			}
		}
		if(k)
		System.out.print("Lucky Number");
		else{
			System.out.print("Not Lucky Number");
		}
	}

}
