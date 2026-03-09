package Synergech;
import java.util.*;
public class AverageOfFiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=arr[i];
		}
		System.out.print(sum/5);
	}

}
