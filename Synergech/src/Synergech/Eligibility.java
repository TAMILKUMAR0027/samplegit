package Synergech;
import java.util.*;
public class Eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		if(n>70 && a>20) {
			 System.out.println("You are eligible for scholarship");
        } else {
            System.out.println("You are not eligible for scholarship");
        }
	}

}
