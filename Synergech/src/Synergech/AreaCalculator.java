package Synergech;
import java.util.*;
public class AreaCalculator {
	public float calculateCircleArea(float radius) {
		return ((22f/7)*radius*radius);
	}
	public int calculateSquareArea(int side) {
		return side*side;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		AreaCalculator obj=new AreaCalculator();
		float radius=s.nextFloat();
		int side=s.nextInt();
		System.out.println(obj.calculateCircleArea(radius));
		System.out.println(obj.calculateSquareArea(side));
	}

}
