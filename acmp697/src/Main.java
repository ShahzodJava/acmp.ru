import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	void solve(Scanner in, PrintWriter out) {
		int l = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		
		int s = 2*(l*h) + 2*(w*h);
		
		out.print((s+15) / 16);
		
	    
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
