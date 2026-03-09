package Synergech;
import java.util.*;
public class forwardNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=1,sum=0;
		while(n!=0) {
			int d=n%10;
			if(d+1==10) {
				d=0;
				sum+=(d)*p;
			}else
			sum+=(d+1)*p;
			p*=10;
			n/=10;
		}
		System.out.print(sum);
	}

}
