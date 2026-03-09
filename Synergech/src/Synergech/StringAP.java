package Synergech;

public class StringAP{
    public static void main(String[] args){
        String sentence="India Cricket Board";
        System.out.println(sentence.charAt(1));
        String first="India";
        String second="INDIA";
        System.out.println(first.compareTo(second));
        System.out.println(first.equals(second));
        System.out.println(sentence.length());
        String text="Hello";
        System.out.println(text.replace('e','a'));
        System.out.println(sentence.substring(6,13));
    }
}
