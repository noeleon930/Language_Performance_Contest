public class prime_Java
{
    final static int targetNumber = 10000;

    public static void main(String[] args)
    {
        /*Timer start!*/
        long start = System.nanoTime();

        /*Initialize the bool*/
        boolean isPrime;
        
        /*Smallest prime number*/
        System.out.println("2");

        /*Try from 3 to targetNumber.
        And the step is 2.
        Except 2, any other prime numbers are all odd.*/
        for(int i = 3; i < targetNumber; i+=2)
        {
            /*Reset to true in every new loop*/
            isPrime = true;
            
            /*At most check to its sqrt.*/
            for(int j = 3; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) System.out.println(i);
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