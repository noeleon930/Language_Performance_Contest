using System;
using System.Diagnostics;

namespace prime_CSharp
{
    class prime_CSharp
    {
        const int targetNumber = 10000;

        static void Main(string[] args)
        {
            /*Timer start!*/
            var start = Stopwatch.StartNew();

            /*Initialize the bool*/
            bool isPrime;
        
            /*Smallest prime number*/
            Console.WriteLine("2");

            /*Try from 3 to targetNumber.
            And the step is 2.
            Except 2, any other prime numbers are all odd.*/
            for(int i = 3; i < targetNumber; i+=2)
            {
                /*Reset to true in every new loop*/
                isPrime = true;
            
                /*At most check to its sqrt.*/
                for(int j = 3; j <= Math.Sqrt(i); j++)
                {
                    if(i % j == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
            
                if(isPrime) Console.WriteLine(i);
            }
 
            /*Timer stop!*/
            start.Stop();

            /*Count the elapsed time*/
            var elapsedTime = start.ElapsedMilliseconds;
 
            Console.WriteLine("--------------------------------");
            Console.WriteLine("targetNumber is " + targetNumber);
            Console.WriteLine("elapsedTime is " + elapsedTime + " ms");
            Console.WriteLine("--------------------------------");
        }
    }
}
