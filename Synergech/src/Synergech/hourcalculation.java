package Synergech;
import java.util.*;
public class hourcalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String start=s.nextLine();
		String end=s.nextLine();
		int min=Integer.parseInt(end.substring(0,2))-Integer.parseInt(start.substring(0,2));
		if(min<0) {
			System.out.print("Invalid");return;
		}
		min*=60;
		min-=Integer.parseInt(start.substring(3,5));
		min+=Integer.parseInt(end.substring(3,5));
		System.out.print(min);
	}
	
}
