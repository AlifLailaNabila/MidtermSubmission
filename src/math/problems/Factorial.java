package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {


    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    //Iteration

    static int factI(int p){
        int k=1;
        for(int j=1;j<=p;j++){
            k*=j;}
        return k;
    }


    public static void main(String[] args) {
        System.out.println("Factorial of 5 is "+factorial(5));
        //Recursion

        int i =5;
        int i2=factorial(i);
        System.out.println("Factorial  "+i+" is: "+i2);
        System.out.println(" finding factorial using iteration of no 5 is: "+factI(5));



        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


    }
}
