package Synergech;
import java.util.*;
public class NumberClassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int t=i;
			int sum=0;
			while(t!=0) {
				sum+=t%10;
				t/=10;
			}
			if(sum%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
