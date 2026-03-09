package Synergech;
import java.util.*;
public class FindLargestInEachRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[][]arr=new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]=s.nextInt();
			}
		}int k=1;
		for(int i=0;i<4;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=0;j<4;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
			System.out.println("The largest number in row"+k+++" is "+max);
		}
	}

}
