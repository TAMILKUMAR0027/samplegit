package Synergech;
import java.util.Scanner;
public class DiagonalElementsoftheMatrix {

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
				if(i==j) {
					arr[i][j]=-1;
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
