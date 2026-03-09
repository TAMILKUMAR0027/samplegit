package Synergech;
import java.util.*;
public class ArraySequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int  i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int m=s.nextInt();
		int p=5;
		int k=0;
		int[][]arr=new int[p][m];
		for(int i=0;i<p;i++) {
			for(int j=0;j<m;j++) {
				if(k<n)
				arr[i][j]=a[k++];
			}
		}
	        int[] seq = new int[p];
	        for (int i = 0; i < p; i++) {
	            seq[i] = s.nextInt();
	        }
	        for (int i = 0; i < p; i++) {
	            int f= seq[i] - 1; 
	            for (int j = 0; j < m; j++) {
	                if (arr[f][j] != 0) {
	                    System.out.print(arr[f][j] + " ");
	                }
	            }
	        }
	}

}
