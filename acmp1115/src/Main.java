import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt();
		int k = in.nextInt();
		out.println((k/n) + " "+ (k%n) + " " +(n-k%n)%n );
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
