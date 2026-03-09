package Synergech;
import java.util.*;

public class CommentAnalysis {

    public static Map<String,Integer> wordFrequency(List<String> comments) {
        Map<String,Integer> map=new HashMap<>();
        for(String c:comments) {
            String[] words=c.toLowerCase().split("\\s+");
            for(String w:words) {
                map.put(w,map.getOrDefault(w,0)+1);
            }
        }
        return map;
    }

    public static String mostRepeatedWord(Map<String,Integer> map) {
        String word="";
        int max=0;
        for(Map.Entry<String,Integer> e:map.entrySet()) {
            if(e.getValue()>max) {
                max=e.getValue();
                word=e.getKey();
            }
        }
        return word;
    }

    public static String longestWord(List<String> comments) {
        String longest="";
        for(String c:comments) {
            String[] words=c.split("\\s+");
            for(String w:words) {
                if(w.length()>longest.length()) {
                    longest=w;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        List<String> comments=new ArrayList<>();
        comments.add("java is powerful");
        comments.add("java is easy");
        comments.add("java is popular language");

        Map<String,Integer> freq=wordFrequency(comments);
        System.out.println("Word Frequencies: "+freq);

        System.out.println("Most Repeated Word: "+mostRepeatedWord(freq));

        System.out.println("Longest Word: "+longestWord(comments));
    }
}
