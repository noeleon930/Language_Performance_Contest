#include <iostream>
#include <cmath>
#include <chrono>

using namespace std;
using namespace std::chrono;

const int targetNumber = 10000;

int main()
{
	/*Timer start!*/
	high_resolution_clock::time_point start = high_resolution_clock::now();
	
	/*Initialize the bool*/
	bool isPrime;

	/*Smallest prime number*/
	cout << "2" << endl;

	/*Try from 3 to targetNumber.
	And the step is 2.
	Except 2, any other prime numbers are all odd.*/
	for(int i = 3; i < targetNumber; i+=2)
	{
		/*Reset to true in every new loop*/
		isPrime = true;

		/*At most check to its sqrt.*/
		for(int j = 3; j <= sqrt(i); j++)
		{
			if(i % j == 0)
			{
				isPrime = false;
				break;
			}
		}

		if(isPrime) cout << i << endl;
	}
	
	/*Timer stop!*/
	high_resolution_clock::time_point end = high_resolution_clock::now();
	
	/*Count the elapsed time*/
	auto elapsedTime = std::chrono::duration_cast<std::chrono::microseconds>(end - start).count();
	
	cout << "--------------------------------" << endl;
	cout << "targetNumber is " << targetNumber << endl;
	cout << "elapsedTime is " << elapsedTime / 1000 << " ms" << endl;
	cout << "--------------------------------" << endl;
	
	return 0;
}
