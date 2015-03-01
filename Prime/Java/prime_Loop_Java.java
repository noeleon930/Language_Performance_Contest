public class prime_Loop_Java
{
    final static int targetNumber = 1000000;

    public static void main(String[] args)
    {
        /*Timer start!*/
        long start = System.nanoTime();

        /*Initialize the bool*/
        boolean isPrime;

        /*The sqrt of targetNumber*/
        double _sqrt;
        
        /*Smallest prime number*/
        // System.out.println("2");

        /*Try from 3 to targetNumber.
        And the step is 2.
        Except 2, any other prime numbers are all odd.*/
        int i = 3;
        while(i < targetNumber)
        {
        	/*Reset in every new loop*/
            isPrime = true;
            _sqrt = Math.sqrt(i);

            int j = 3;
            while(j <= _sqrt)
            {
            	if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }

                j++;
            }

            // if(isPrime) System.out.println(i);

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