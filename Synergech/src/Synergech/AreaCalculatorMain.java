package Synergech;
import java.util.*;

public class AreaCalculatorMain {
	    public float calculateCircleArea(float radius){
	        return (22f/7)*radius*radius;
	    }
	    public int calculateSquareArea(int side){
	        return side*side;
	    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        AreaCalculator ac=new AreaCalculator();
        System.out.println("1.Calculate circle area");
        System.out.println("2.Calculate square area");
        System.out.print("Enter your choice: ");
        int n=s.nextInt();
        if(n==1){
            float radius=s.nextFloat();
            System.out.println(ac.calculateCircleArea(radius));
        }else if(n==2){
            int side=s.nextInt();
            System.out.println(ac.calculateSquareArea(side));
        }else{
            System.out.println("Invalid choice");
        }
    }
}
