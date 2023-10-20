import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	void solve(Scanner in, PrintWriter out) {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int maxV = Math.max(c, Math.max(a, b));
		int minV = Math.min(c, Math.min(a, b));
		out.println(maxV-minV);
		
	  
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
