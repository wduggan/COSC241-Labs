package week04;

/**
 * Skeleton code for an array based implementation of Young's tableau.
 *
 * @author Iain Hewson
 */
public class TableauApp {
  
    /**
     * The main method is just used for testing.
     *
     * @param args command line arguments are not used.
     */
    public static void main(String[] args) {
        final int[][] valid = {{1, 4, 5, 10, 11}, {2, 6, 8}, {3, 9, 12}, {7}};
        System.out.println(TableauApp.toString(valid));
        System.out.println(rowLengthsDecrease(valid));
        System.out.println(rowValuesIncrease(valid));
        System.out.println(columnValuesIncrease(valid));
    }
  
    /**
     * Determines whether the array passed to it is a valid tableau or not.
     * @param t a two-dimensional array to test for tableau-ness.
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean isTableau(int[][] t){
    
        return false;
    }

    /**
     * A method that checks the length of each row in Tableau.
     * @param t - 2d Tableau Array
     * @return returns true if no row is longer than the preceeding row,
     * otherwise false
     */
    public static boolean rowLengthsDecrease(int[][] t){
        for (int row = 0; row < t.length-1; row++) {
            if (t[row+1].length > t[row].length) {
                return false;
            }
        } 
        return true;      
    }

    /**
     * A method that checks the value of each digit in Tableau.
     * @param t - 2d Tableau Array
     * @return returns true if from left to right in any row,
     * the integers are increasing, otherwise false
     */
    public static boolean rowValuesIncrease(int[][] t){
        for (int row = 0; row < t.length; row++) {
            for (int col = 0; col < t[row].length-1; col++){
                if (t[row][col] >= t[row][col+1]){
                    return false;
                }
            }
        }     
        return true;
    }

    /**
     * A method that checks the value of each digit in Tableau.
     * @param t - 2d Tableau Array
     * @return returns true if from left to right in any row,
     * the integers are increasing, otherwise false
     */
    public static boolean columnValuesIncrease(int[][] t){
        for (int row = 1; row < t.length; row++) {
            for (int col = 0; col < t[row].length; col++){
                if (t[row][col] < t[row-1][col]){
                    return false;
                }
            }
        }     
        return true;
    }

    /**
     * A method that checks the value of each digit in Tableau.
     * @param t - 2d Tableau Array
     * @return returns true if from left to right in any row,
     * the integers are increasing, otherwise false
     */
    public static boolean isSetOf1toN(int[][] t){
        
        return false;
    }
  
    /**
     *  Returns a string representation of an array based tableau.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return a string representation of an array based tableau.
     */
    public static String toString(int[][] t) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                result.append(String.format("%-4s", t[i][j]));
            }
            if (i < t.length-1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
  
}
