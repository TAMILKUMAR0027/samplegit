package Synergech;
import java.util.*;
public class Multiplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=1;i<=m;i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}
}