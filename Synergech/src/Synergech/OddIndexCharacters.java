package Synergech;
import java.util.Scanner;

public class OddIndexCharacters {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        StringBuilder oddChars=new StringBuilder();
        for(int i=0;i<input.length();i++){
            if(i%2!=0){
                oddChars.append(input.charAt(i));
            }
        }
        System.out.print(oddChars.toString());
    }
}

