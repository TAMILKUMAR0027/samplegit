package Synergech;
import java.util.*;
public class BiggestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.print("A is Greater "+ a);
			}else {
				System.out.print("C is Greater"+ c);
			}
		}else {
			if(b>c) {
				System.out.print("B is greater"+b);
			}else {
				System.out.print("C is greater"+c);
			}
		}
	}

}
