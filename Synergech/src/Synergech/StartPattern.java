package Synergech;
import java.util.*;
public class StartPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
	}

}
