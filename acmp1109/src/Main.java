import java.io.*;
import java.util.*;


public class Main {
	
	void solve(Scanner in, PrintWriter out) {
		int a = in.nextInt();
		String s1= String.format("The next number for the number %d is %d.",a,a+1);
		String s2= String.format("The previous number for the number %d is %d.",a,a-1);
		out.println(s1);
		out.println(s2);
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
