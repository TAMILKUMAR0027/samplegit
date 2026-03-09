package Synergech;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		switch(st) {
		case "apple":
        case "orange":
        case "grape":
            System.out.println("This is a fruit");
            break;
        case "potato":
        case "onion":
            System.out.println("This is a vegetable");
            break;
        default:
            System.out.println("I cannot classify this as a fruit or vegetable");
			}
		}
	

}
