package week03;

/** RecursiveApp.java, COSC241, March 10 2020.
    @author William Duggan
*/
public class RecursiveApp{
  
    /** Creates a data field of type boolean. **/
    private boolean[] coins;
  
    /** Creates the main method which will print the outputs.
     * @param args - args of type array of String
     **/
    public static void main(String[] args){
        System.out.println();

        /**
        long num = 123; // just to test
        long result = sumOfDigits(num);
        System.out.println("Sum of digits in " + num + " is " + result);
        long numOfDigits = digits(num);
        System.out.println("Number of digits in " + num + " is " + numOfDigits);
        **/
    }
  
    /** Method which will calculate the number of digits within n.
     * @return the number of digits
     * @param n - number of type long
     **/
    public static long digits(long n){
        if (n < 10) {
            return 1;
        }
    
        return 1 + digits(n/10);
    }
  
    /** Method which will take in a number n, and find the sum of it's digits.
     * If n is 0 then return 0.
     * If not then use '%' to divide by 10 and get the remainder,
     * this is how we split the number into individual digits
     * For example, in n = 123, then, 123 % 10 = 12.3.
     * Then the final return statement will take that 3 away,
     * and put the 12 back into the function,
     * calling it again and doing the same thing, doing 12 % 10 = 1.2,
     * then taking that 2 and adding it onto the 3 from before, etc, etc.
     * @return the sum of the digits
     * @param n - number of type long
     **/
    public static long sumOfDigits(long n){
        if (n == 0){
            return 0;
        } else {
            return (n % 10 + sumOfDigits(n / 10)); 
        }
    }

}

