package Spill;
import static java.lang.System.*;

public class Spill{
	
	// Grid Initial Parameters
	public grid_x;
	public grid_y;
	public obstacle_count;
	
	//public int m, n, surface[m,n]
	public Grid surface;
	
	
	private Spill(){
		
		// Grid Initial Parameters
		grid_x = 10;
		grid_y = grid_x;
		obstacle_count = 3;
		
		//Initialise(surface)	// fills surface with initial values of CLEAR or OBSTACLE 
		surface = new Grid( grid_x, grid_y, obstacle_count);
		
	}

	public void Spill(int x, int y, int strength) {
		
		if (strength == 0) return;
		if ( x < 0 || x >= grid_x || y < 0 || y >= grid_y ) return;
		
		Cell cell =  surface.getCell(x,y);
		if cell is an OBSTACLE   return
		If cell < strength  surface(x,y) = strength 	
		Spill(x-1,y-1,strength-1)
		Spill(x-1,y,strength-1)
		Spill(x-1,y+1,strength-1)
		Spill(x,y-1,strength-1)
		Spill(x,y+1,strength-1)
		Spill(x+1,y-1,strength-1)
		Spill(x+1,y,strength-1)
		Spill(x+1,y+1,strength-1)
	}
	
	public static void main(String[] args){
	
		print("Hello world");
	
	}
	
	private static void print(String string){
		out.println(string);
	}
	
	public String toString(){
		out.println("Nothing yet");
	}

}