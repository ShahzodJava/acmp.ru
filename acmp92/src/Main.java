import java.io.*;
import java.util.*;


public class Main {
	
	void solve(Scanner in, PrintWriter out) {
		int s = in.nextInt();
		int a = s/6;
		int b = 4*s/6;
		int c = s/6;

		out.print(a+" "+b+" "+c);
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
