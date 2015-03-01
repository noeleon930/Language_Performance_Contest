public class prime_TailRecursion_Java
{
    final static int targetNumber = 1000000;

    /*Initialize the bool*/
    static boolean isPrime;

    /*The sqrt of targetNumber*/
    static double _sqrt;

    /*Tail recursion*/
    public static void checkPrime(int i, int j)
    {
    	if(j > _sqrt)
		{
			// System.out.println(i);
		}
		else
		{
			if(i % j != 0) checkPrime(i, j + 1);
		}
    }

    public static void main(String[] args)
    {
        /*Timer start!*/
        long start = System.nanoTime();

        /*Smallest prime number*/
        // System.out.println("2");

        /*Try from 3 to targetNumber.
        And the step is 2.
        Except 2, any other prime numbers are all odd.*/
        int i = 3;
        while(i < targetNumber)
        {
            /*Reset in every new loop*/
            _sqrt = Math.sqrt(i);
			
			/*At most check to its sqrt.*/
			checkPrime(i, 3);

			/*For next loop*/
            i += 2;
        }
 
        /*Timer stop!*/
        long end = System.nanoTime();

        /*Count the elapsed time*/
        long elapsedTime = ((end - start) / 1000000);
 
        System.out.println("--------------------------------");
        System.out.println("targetNumber is " + targetNumber);
        System.out.println("elapsedTime is " + elapsedTime + " ms");
        System.out.println("--------------------------------");
    }
}