using System;

namespace CodingProblems
{
    class Armstrong
    {   
        public bool isArmstrong(int x)
        {
            int n = x.ToString().Length;
            int temp = x, sum = 0;
            while (temp != 0)
            {
                int r = temp % 10;
                sum = sum + (int)Math.Pow(r, n);
                temp = temp / 10;
            }

            return (sum == x);
        }
        
         public static void Main(string[] args)
        {
          Console.Write("Enter any number: ");
          Console.WriteLine(new Armstrong().isArmstrong(int.Parse(Console.ReadLine())));
          
          Console.Read();
        }
    }
}
