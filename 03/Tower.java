package week03;

/**
 *  A recursive representation of a tower of blocks.
 *
 * @author Michael Albert
 */
public class Tower{

    /** The top block. */
    private char top;
 
    /** The rest of the tower. */
    private Tower rest;

    /** Creates the main method which will print the outputs.
     * @param args - args of type array of String
     **/
    public static void main(String[] args){
        Tower a = new Tower();
        System.out.println(a.height());
        System.out.println(a.count('a'));
    }
    

    /**
     * Creates a new empty Tower.
     */
    public Tower() {
        this.top = ' ';
        this.rest = null;
    }

    /**
     *  External classes can only create empty towers and manipulate
     *  them using public methods, because this constructor is
     *  private.
     * @param top the top block in this tower
     * @param rest the rest of the tower
     */
    private Tower(char top, Tower rest) {
        this.top = top;
        this.rest = rest;
    }

    /**
     *  Returns true if this tower is empty, otherwise false.  Empty
     *  towers are represented with the top block being a space
     *  character.
     * @return whether the tower is empty or not.
     */
    public boolean isEmpty() {
        return top == ' ';
    }

    /**
     *  Creates a new tower by adding the given block to the top of
     *  this tower.
     * @param block a block to add to the top of this tower.
     * @return a new tower created by adding a block to the top of
     * this tower.
     */
    public Tower add(char block) {
        return new Tower(block, this);
    }
    
    /** Method which will check the height of the tower
     * and how many blocks are in it.
     * If it is empty then return 0, otherwise cll method again.
     * @return the number of blocks/height of the tower
     **/
    public int height(){
        if (isEmpty()){
            return 0;
        }
        return 1 + rest.height();
    }
    
    /** Method which will take in a parameter c to
     * check the character of the block,
     * and count the blocks of the tower and return how many there are.
     * @return number of blocks in tower
     * @param c - of type char
     **/
    public int count(char c){
        if(isEmpty()){
            return 0;
        }
        if (c == top){
            return 1 + rest.count(c);
        }
        return 0 + rest.count(c);
        // same as saying else if (c != top), return 0 and do the method again
    }

}
