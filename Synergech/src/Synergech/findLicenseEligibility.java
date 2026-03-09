package Synergech;
import java.util.*;

public class findLicenseEligibility {
    public static boolean FindLicenseEligibility(int age, String state){
        state = state.toUpperCase();
        if(age > 18 && age < 60 && (state.equals("TN") || state.equals("KA") || state.equals("KL")))
            return true;
        if((age > 60 || age < 18) && (state.equals("TN") || state.equals("KA") || state.equals("KL")))
            return false;
        if(!(state.equals("TN") || state.equals("KA") || state.equals("KL")))
            return age > 15;
        return false;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        s.nextLine();
        String state = s.nextLine().toUpperCase();
        System.out.print(FindLicenseEligibility(age, state));
    }
}
