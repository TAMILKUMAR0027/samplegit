package Synergech;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i++) {
			boolean isPrime = true;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					isPrime=false;
				}
			}
			if(isPrime)
			System.out.print(i+" ");
			
		}
	}

}
