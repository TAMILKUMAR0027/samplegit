package Synergech;
import java.util.*;

public class BasicCalculator {
    public int add(int a,int b){
        return a+b;
    }
    public long subtract(long a,long b){
        return a-b;
    }
    public float multiply(float a,float b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        BasicCalculator bc=new BasicCalculator();
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(bc.add(a,b));
        long x=s.nextLong();
        long y=s.nextLong();
        System.out.println(bc.subtract(x,y));
        float m=s.nextFloat();
        float n=s.nextFloat();
        System.out.println(bc.multiply(m,n));
    }
}
