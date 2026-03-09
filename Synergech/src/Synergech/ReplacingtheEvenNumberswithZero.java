package Synergech;
import java.util.*;
public class ReplacingtheEvenNumberswithZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[][]arr=new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(arr[i][j]%2==0) {
					arr[i][j]=0;
				}
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}

}
