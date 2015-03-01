object prime_Loop_Scala
{
	val targetNumber = 1000000

	/*Set global to improve recursive performance*/
	var _sqrt = 0

	def main(args: Array[String])
	{
		/*Timer start!*/
		val start = System.nanoTime()

		/*Smallest prime number*/
		// Console.println("2")

		/*Try from 3 to targetNumber.
        And the step is 2.
        Except 2, any other prime numbers are all odd.*/
		var i = 3
		while(i <= targetNumber)
		{
			/*Reset in  every new loop*/
			var isPrime = true
			var j = 3
			_sqrt = Math.sqrt(i).toInt

			while(j <= _sqrt && isPrime == true)
			{
				if(i % j == 0) isPrime = false
				j = j + 1
			}

			// if(isPrime) Console.println(i)

			i = i + 2
		}		

		/*Timer stop!*/
		val end = System.nanoTime()

		Console.println("--------------------------------")
        Console.println("targetNumber is " + targetNumber)
        Console.println("elapsedTime is " + (end - start) / 1000000 + " ms")
        Console.println("--------------------------------")
	}
}
