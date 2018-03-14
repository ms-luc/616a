import static java.lang.System.*;

public class Spill{
	
	public int m, n, surface[m,n]
	
	private Spill(){
		
		Initialise(surface)	// fills surface with initial values of CLEAR or OBSTACLE 
		
	}

	public static void main(String[] args){
	
		print("Hello world");
	
	}

	void Spill(int x, int y, int strength) {
		if strength =0 return 
		If x<0 or x>=m or y<0 or y>=n return
		int cell = surface(x,y)
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
	
	private static void print(String string){
		out.println(string);
	}

}