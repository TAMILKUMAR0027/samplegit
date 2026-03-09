package Synergech;
import java.util.*;
public class EndsWithZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<10) {
			System.out.print("Invalid");
		}else {
		for(int i=10;i<=n;i+=10) {
			if(i%10==0) {
				System.out.print(i+" ");
			}
		}
		}
	}

}
