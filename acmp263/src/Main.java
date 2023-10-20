import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt();
		int i = in.nextInt();
		int j = in.nextInt();
		
		int a = Math.min(j,i);
		int b = Math.max(i,j);		
		
		
				     
		out.println( Math.min( (b - a -1), (n + a - b - 1) ));
		
	    
	}
	
	void run() {
		try (
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out)
		){
			solve(in, out);			
		}
	}
	
	public static void main(String args[]) {
		new Main().run();
	}
	

}
