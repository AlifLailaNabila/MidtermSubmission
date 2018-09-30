package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Assert.assertEquals(9591,PrimeNumber.isPrime(2));


        int [] array2 = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        Assert.assertEquals(9,FindMissingNumber.findMissingNum(array2,9));

        Assert.assertEquals(120,Factorial.factorial(5));
        Assert.assertEquals(120,Factorial.factI(5));
    }
}
