package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String st1 = "MADAM";
        String toLowerCase = st1.toLowerCase();
        String st2 = "";

        for( int i = toLowerCase.length()-1; i>=0;i--){
            st2 = st2 + toLowerCase.charAt(i);

        }
        if(toLowerCase.equals(st2)){
            System.out.println(st1 + "--word is a palindron");
        } else {
            System.out.println(st1 + "--word is not a palindron");
        }


    }
}
