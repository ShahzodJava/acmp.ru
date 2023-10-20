import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	void solve(Scanner in, PrintWriter out) {
		long n= in.nextLong();
		
		out.println(n/10*(n/10+1)*100+25);
	    
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
