package Synergech;
import java.util.*;
public class MultiplesOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[100/5];int j=0;
		for(int i=1;i<=100;i++){
			if(i%5==0) {
				arr[j]=i;j++;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
