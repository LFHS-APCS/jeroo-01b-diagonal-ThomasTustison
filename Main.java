/**
 * Write code in runJerooCode() to have a single Jeroo 
 * put a flower at (0,0), (1,1), (2,2) and (3,3).
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *      turn(LEFT)
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        new JerooGUI();
        runJerooCode();
        
    }
   
      
    
     
    public static void runJerooCode() {
     Jeroo Jerry = new Jeroo(0,0,5);
Jerry.plant();
Jerry.hop();
Jerry.turn(LEFT);
Jerry.turn(LEFT);
Jerry.turn(LEFT);
Jerry.hop();
Jerry.plant();
Jerry.hop();
Jerry.turn(LEFT);
Jerry.hop();
Jerry.plant();
Jerry.hop();
Jerry.turn(LEFT);
Jerry.turn(LEFT);
Jerry.turn(LEFT);
Jerry.hop();
Jerry.plant();
Jerry.turn(LEFT);
Jerry.hop();

    }

}
