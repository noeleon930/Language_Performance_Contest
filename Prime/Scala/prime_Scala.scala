object prime_Scala
{
	val targetNumber = 10000

	/*Set global to improve recursive performance*/
	var _sqrt = 0

	def checkPrime(i: Int, j: Int)
	{
		if(j > _sqrt)
		{
			Console.println(i)
		}
		else
		{
			if(i % j != 0) checkPrime(i, j + 1)
		}
	}

	def main(args: Array[String])
	{
		/*Timer start!*/
		val start = System.nanoTime()

		/*Smallest prime number*/
		Console.println("2")

		/*Try from 3 to targetNumber.
        And the step is 2.
        Except 2, any other prime numbers are all odd.*/
		for (i <- 3 until(targetNumber, 2))
		{
			/*Reset in  every new loop*/
			_sqrt = Math.sqrt(i).toInt

			/*At most check to its sqrt.*/
			checkPrime(i, 3)
		}

		/*Timer stop!*/
		val end = System.nanoTime()

		Console.println("--------------------------------")
        Console.println("targetNumber is " + targetNumber)
        Console.println("elapsedTime is " + (end - start) / 1000000 + " ms")
        Console.println("--------------------------------")
	}
}
