package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        HashMap<String,Integer> wrdmap = new  HashMap<String,Integer>();
        String[] splitwords = st.split("");

        for(String word : splitwords){
            Integer count = wrdmap.get(splitwords);
            if( count == null){
                count = 0;
            }
            wrdmap.put(word, count+1);
        }
        for (Map.Entry<String,Integer> s :wrdmap.entrySet()){
            System.out.println(s.getKey()+ " " +s.getValue()+"time(s)");
        }


    }


}
