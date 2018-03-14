package Spill;
import java.util.Scanner;

/**
  * Test program for the Spill algorithms.
  * @author Sophie Quigley
  * @author PUT YOUR NAMES HERE
  * 
  */
public class Test {
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TestSpill1();
        TestSpill2(in);
    }
    
    /**
     * Tests the Spill function on randomly generated surfaces.
     */
    private static void TestSpill1 () {
        int increment = 5;
        for (int percent=0; percent<=200; percent +=increment, increment*=2) {
            Grid surface = new Grid(10,20,percent);
            System.out.println("10X20 grid with " + percent + " percent obstacles:");
            System.out.println(surface);
            System.out.println("Spill of strength 5 at (5,5)");
            surface.Spill(5, 5, 5);
            System.out.println(surface);
        }
    }
    /**
     * Tests the Spill function as specified in the input.
     * Input first reads a Grid
     * Then the following line specifying the spill:
     * strength row col 
     * @param in  Scanner (standard input)
     */
    private static void TestSpill2(Scanner in) {
        Grid surface = new Grid(in);
        System.out.println("Input Grid:");
        System.out.println(surface);
        int strength = in.nextInt();
        int row = in.nextInt();
        int col = in.nextInt();
        System.out.println("Spill of strength " + strength + " at (" + row + "," + col +")");
        surface.Spill(row,col,strength);
        System.out.println(surface);
        
    }
      
}
