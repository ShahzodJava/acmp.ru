import java.io.*;
import java.util.*;


public class Main {
	
	void solve(Scanner in, PrintWriter out) {
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int n = in.nextInt();
		
		out.print(a1+(n-1)*(a2-a1));
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
