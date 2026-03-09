package Synergech;
import java.util.*;
public class EvenNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[200];
		for(int i=0;i<200;i++)
			arr[i]=i+1;
		int[] arr2=new int[arr.length/2];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr2[j]=arr[i];j++;
			}
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
