package hackerRank;

import java.util.*;

public class Factorial {
	public static int factorial(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 2;
		else
			return n * factorial(n - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		sc.close();

		int res = factorial(n);
		System.out.println(res);
	}
}
