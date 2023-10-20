import java.io.*;
import java.util.*;


public class Main {
	
	void solve(Scanner in, PrintWriter out) {
		int a = in.nextInt();		
		out.print(a+1);
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
