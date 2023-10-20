import java.io.*;
import java.util.*;


public class Main {
	
	void solve(Scanner in, PrintWriter out) {
		long a = in.nextLong();
		long b = in.nextLong();
		out.println(a*b);
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
