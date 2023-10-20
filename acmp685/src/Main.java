import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	void solve(Scanner in, PrintWriter out) {
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int a3 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int b3 = in.nextInt();
		
		int maxA = Math.max(a1, Math.max(a1, a3));
		int minA = Math.min(a1, Math.min(a1, a3));
		int midA = a1+a2+a3 - minA - maxA;
		
		int maxB = Math.max(b1, Math.max(b1, b3));
		int minB = Math.min(b1, Math.min(b1, b3));
		int midB = b1+b2+b3 - maxB - minB;	
		
		int sum = maxA*maxB + midA*midB + minA*minB;
		out.println(sum);
	    
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
