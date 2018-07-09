import java.util.Scanner;

//sqrt(n) solution
class Prime {
	
	static boolean isPrime(int n)
	{
		if (n == 2) return true;

		if (n <= 1 || n % 2 == 0 || n % 3 == 0)
		    return false;
	
		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
			return false;
	
		return true;
	}


	public static void main(String args[])
	{
		System.out.print("Enter any no. to check: ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPrime(n));
	}
}
