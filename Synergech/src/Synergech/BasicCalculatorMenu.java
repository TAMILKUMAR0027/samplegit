package Synergech;
import java.util.*;
public class BasicCalculatorMenu {
	   public int add(int a,int b){
	        return a+b;
	    }
	   public long subtract(long a,long b){
	        return a-b;
	    }
	   public float multiply(float a,float b){
		    return a*b;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BasicCalculatorMenu bc=new BasicCalculatorMenu();
		System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.print("Enter your choice:");
        int n=s.nextInt();
        if(n==1){
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println(bc.add(a,b));
        }
        else if(n==2){
            long a=s.nextLong();
            long b=s.nextLong();
            System.out.println(bc.subtract(a,b));
        }
        else if(n==3){
            float a=s.nextFloat();
            float b=s.nextFloat();
            System.out.println(bc.multiply(a,b));
        }
        else{
            System.out.println("Invalid choice");
        }
	}

}
