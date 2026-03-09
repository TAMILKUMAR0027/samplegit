package Synergech;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=-n;i<=n;i++) {
			int l=(i>0)?i:-i;
			for(int k=0;k<l;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-l;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
