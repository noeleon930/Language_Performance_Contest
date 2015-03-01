#include <iostream>
#include <cmath>
#include <chrono>

using namespace std;
using namespace std::chrono;

const int targetNumber = 1000000;

int main()
{
	/*Timer start!*/
	high_resolution_clock::time_point start = high_resolution_clock::now();

	/*Initialize the bool*/
	bool isPrime;

	/*The sqrt of targetNumber*/
	int _sqrt;

	/*Smallest prime number*/
	// cout << "2" << endl;

	/*Try from 3 to targetNumber.
	And the step is 2.
	Except 2, any other prime numbers are all odd.*/
	int i = 3;
	while (i < targetNumber)
	{
		/*Reset in every new loop*/
		isPrime = true;
		_sqrt = sqrt(i);

		/*At most check to its sqrt.*/
		int j = 3;
		while (j <= _sqrt)
		{
			if (i % j == 0)
			{
				isPrime = false;
				break;
			}
			j++;
		}

		// if(isPrime) cout << i << endl;

		i += 2;
	}

	/*Timer stop!*/
	high_resolution_clock::time_point end = high_resolution_clock::now();

	/*Count the elapsed time*/
	auto elapsedTime = std::chrono::duration_cast<std::chrono::microseconds>(end - start).count();

	cout << "--------------------------------" << endl;
	cout << "targetNumber is " << targetNumber << endl;
	cout << "elapsedTime is " << (float)elapsedTime / 1000 << " ms" << endl;
	cout << "--------------------------------" << endl;

	return 0;
}
