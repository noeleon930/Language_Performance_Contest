object prime_Scala
{
	val targetNumber = 10000

	def main(args: Array[String])
	{
		/*Timer start!*/
		val start = System.nanoTime()

		/*Initialize the bool*/
		var isPrime = true

		/*Pre-set the sqrt of targetNumber*/
        var _sqrt = 0

		/*Smallest prime number*/
		Console.println("2")

		/*Try from 3 to targetNumber.
        And the step is 2.
        Except 2, any other prime numbers are all odd.*/
		for (i <- 3 until(targetNumber, 2))
		{
			/*Reset in  every new loop*/
			isPrime = true
			_sqrt = Math.sqrt(i).toInt

			/*At most check to its sqrt.*/
			(3 to _sqrt).toStream.takeWhile((j: Int) => isPrime == true).foreach((j: Int) => if(i % j == 0) isPrime = false)
			if(isPrime) Console.println(i)
		}

		/*Timer stop!*/
		val end = System.nanoTime()

		Console.println("--------------------------------")
        Console.println("targetNumber is " + targetNumber)
        Console.println("elapsedTime is " + (end - start) / 1000000 + " ms")
        Console.println("--------------------------------")
	}
}
