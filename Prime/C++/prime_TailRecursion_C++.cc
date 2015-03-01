#include <iostream>
#include <cmath>
#include <chrono>

using namespace std;
using namespace std::chrono;

const int targetNumber = 1000000;

/*Initialize the bool*/
bool isPrime;

/*The sqrt of targetNumber*/
int _sqrt;

void checkPrime(int i, int j)
{
	if (j > _sqrt)
	{
		//cout << i << endl;
	}
	else
	{
		if (i % j != 0) checkPrime(i, j + 1);
	}
}

int main()
{
	/*Timer start!*/
	high_resolution_clock::time_point start = high_resolution_clock::now();

	/*Smallest prime number*/
	//cout << "2" << endl;

	/*Try from 3 to targetNumber.
	And the step is 2.
	Except 2, any other prime numbers are all odd.*/
	int i = 3;
	while (i < targetNumber)
	{
		/*Reset in every new loop*/
		_sqrt = sqrt(i);

		/*At most check to its sqrt.*/
		checkPrime(i, 3);

		/*For next loop*/
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
