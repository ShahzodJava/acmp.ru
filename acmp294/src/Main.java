import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	void solve(Scanner in, PrintWriter out) {
		int bolt = in.nextInt();
		int boltPer = in.nextInt();
		int boltPrice = in.nextInt();
		int nut = in.nextInt();
		int nutPer = in.nextInt();
		int nutPrice = in.nextInt();
		
		int costB = bolt * boltPrice + nut * nutPrice;
		
		int boltA = bolt * (100 - boltPer) / 100;
		int nuta = nut * (100 - nutPer) / 100;
		int tPairs = Math.min(nuta, boltA);
		
		int costA = tPairs * boltPrice + tPairs * nutPrice;
		
		int res = costB - costA;
		
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
