package Spill;
import static java.lang.System.*;

public class Spill{
	
	// Grid Initial Parameters
	/**
     * Number of rows in grid
     */
	public int grid_x;
	/**
     * Number of columns in grid
     */
	public int grid_y;
	/**
     * Number of obstacles in grid
     */
	public int obstacle_count;
	
	/**
     * Grid
     */
	public Grid surface; //public int m, n, surface[m,n]
	
	/**
     * Constructor
     * initialises all needed variables including Grid
     */
	private Spill(){
		
		// Grid Initial Parameters
		grid_x = 10;
		grid_y = grid_x;
		obstacle_count = 3;
		
		//Initialise(surface)	// fills surface with initial values of CLEAR or OBSTACLE 
		surface = new Grid( grid_x, grid_y, obstacle_count);
		
	}

	/**
     * Executes the Spill function recursively
     * @param x current cell's x position
     * @param y current cell's y position
     * @param strength current cell strength
     */
	public void Spill(int x, int y, int strength) {
		
		if (strength == 0) return;
		if ( x < 0 || x >= grid_x || y < 0 || y >= grid_y ) return;
		
		
		Cell cell =  surface.getCell(x,y);
		if(cell.getValue() == -1)   return;
		
		
		if(cell.getValue() < strength) surface.setCell(x,y,strength);
			//If cell < strength  surface(x,y) = strength 	
			
		Spill(x-1,y-1,strength-1);
		Spill(x-1,y,strength-1);
		Spill(x-1,y+1,strength-1);
		Spill(x,y-1,strength-1);
		Spill(x,y+1,strength-1);
		Spill(x+1,y-1,strength-1);
		Spill(x+1,y,strength-1);
		Spill(x+1,y+1,strength-1);
	}
	
	/**
     * Executes the Spill function recursively
     * @param args arguments
     */
    @Override
	public static void main(String[] args){
	
		print("Hello world");
	
	}
	
	/**
     * stdout using System.out.println()
	 * @param string the input string
     */
	private static void print(String string){
		out.println(string);
	}
	
	/**
     * Returns a string describing the Spill
     * @return Spill informaton
     */
    @Override
	public String toString(){
		return "Nothing yet";
	}

}