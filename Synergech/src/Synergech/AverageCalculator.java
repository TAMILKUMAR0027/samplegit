
package Synergech;
import java.util.*;

public class AverageCalculator{
    public static double findAverage(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/(double)arr.length;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        System.out.print(findAverage(a));
    }
}
