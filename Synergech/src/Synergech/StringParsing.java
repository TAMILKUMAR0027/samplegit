package Synergech;
import java.util.*;

public class StringParsing {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        char[] ch=st.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
}
