using System;


namespace CodingProblems
{
    class Fibonacci
    {
        public int fib(int n)
        {
            int[] f = new int[n + 2];
            int i;

            f[0] = 0;
            f[1] = 1;

            Console.Write(f[0] + " " + f[1] + " ");

            for(i = 2; i <= n; i++)
            {
                f[i] = f[i - 1] + f[i - 2];
                Console.Write(f[i] + " ");
            }

            return f[n];
       }

        public static void Main(string[] args)
        {
            Console.Write("Enter any number: ");
            new Fibonacci().fib(int.Parse(Console.ReadLine()));
            Console.Read();
        }
    }
}
