import java.math.*;
import java.util.*;

public class HackerRankProblem {

	public static void main(String[] args) {

		//https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html
		Scanner scanner = new Scanner(System.in);

		//t1 and t2 input values	     
		System.out.println("Please enter 0 or 1 for t1 ");
		BigInteger t1 = BigInteger.valueOf(scanner.nextLong());
		
		System.out.println("Please enter 0 or 1 for t2");
		BigInteger t2 = BigInteger.valueOf(scanner.nextLong());

		System.out.println("Please enter a number between 3 and 20 for n");
		int n = scanner.nextInt();
		BigInteger x = BigInteger.ZERO;
		for (int i = 3; i <= n; i++) {//
			x = t2.multiply(t2);//t2 squared
			x = x.add(t1);//adding t1 to t2
			t1 = t2;//following sequence to next number
			t2 = x;//answer from previous sequence set to t2
			
		}

		scanner.close();
		System.out.println("Answer: "+ x);//switched from n... x provides BigInteger value
	}

}