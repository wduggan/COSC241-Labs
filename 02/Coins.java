package week02;
import java.util.Random;

/** Coins.java, COSC241, March 6 2020.
    @author William Duggan
*/
public class Coins{

    /** Creates a static final data field. **/
    public static final boolean HEADS = true;
    /** Creates a static final data field. **/
    public static final boolean TAILS = false;

    /** Creates a data field of type boolean. **/
    private boolean[] coins;
    /** Creates a data field of type Sring. **/
    private String coinTosses = "";

    /** Creates boolean array and instances of Coins class.
        @param args - args of type array of String
    **/
    public static void main(String[] args){
        boolean[] b = {HEADS, TAILS, HEADS, HEADS, TAILS};
        Coins c = new Coins(b);
        System.out.println(c.countHeads());
        System.out.println(c.toString());
        System.out.println(c.countRuns());

        Coins d = new Coins(c.toString());
        System.out.println(d.toString());

        Coins e = new Coins(10);
    }

    /** Constructor which takes in an Array of type boolean.
        @param coins - takes in an array of type boolean
    **/
    public Coins(boolean[] coins){
        this.coins = coins;
    }

    /** Constructor which takes in a String.
        @param c - c of type string
    **/
    public Coins(String c){
        this.coins = new boolean[c.length()];
        for(int i = 0; i < c.length(); i++){
            if(c.charAt(i) == 'H'){
                this.coins[i] = HEADS;
            } else if(c.charAt(i) == 'T'){
                this.coins[i] = TAILS;
            } 
        }   
    }

    /** Constructor which takes in an int value.
        @param length - length of type int 
    **/
    public Coins(int length){
        boolean[] coins = new boolean[length];
        int nums;
        Random r = new Random();
        nums = r.nextInt(2);

        for(int i = 0; i < coins.length; i++){
            if(nums == 0){
                coins[i] = HEADS;
            } else if(nums == 1){
                coins[i] = TAILS;
            }
        }
        this.coins = coins;
    }

    /** Method which counts the number of heads thrown.
        @return heads - returns int value heads
    **/
    public int countHeads(){
        int heads = 0;
        int tails = 0;
        for(int i = 0; i < coins.length; i++){
            if (coins[i] == HEADS){
                heads++;
            }
        }
        return heads;
    }

    /** Method which creates a string filled with each coin toss value.
        @return coinTosses - returns String value coinTosses
    **/
    public String toString(){
        for(int i = 0; i < coins.length; i++){
            if (coins[i] == HEADS){
                coinTosses = coinTosses + "H";
            } else if (coins[i] == TAILS){
                coinTosses = coinTosses + "T";
            }
        }  
        return coinTosses;
    }

    /** Method which counts the number of runs in the string of H and T.
        @return runs - returns int value runs
    **/
    public int countRuns(){
        if (coins.length == 0) {
            return 0;
        }
        int runs = 1;
        for(int i = 0; i < coinTosses.length() - 1; i++){
            if(coinTosses.charAt(i+1) != coinTosses.charAt(i)){
                runs++;
            }
        }
        return runs;
    }       
}
