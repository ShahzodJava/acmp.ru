import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt();
		BigInteger result = BigInteger.ONE;
		if (n<2) {
			out.println(1);
		} else {
			for (int i = 2; i <= n; i++)
		        result = result.multiply(BigInteger.valueOf(i));		     
			out.println(result);
		}
	    
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
