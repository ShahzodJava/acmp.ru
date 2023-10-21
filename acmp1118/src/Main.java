import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	void solve(Scanner in, PrintWriter out) {
		int h = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();	
		int res = Math.max(1, 1+ (h-a)/(a-b));
		
		out.println(res);
	    
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
