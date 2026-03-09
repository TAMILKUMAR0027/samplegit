package Synergech;
import java.util.*;
public class MultiplesOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=n;
		while(i<=100) {
			System.out.print(i+" ");
			i+=n;
		}
	}

}
