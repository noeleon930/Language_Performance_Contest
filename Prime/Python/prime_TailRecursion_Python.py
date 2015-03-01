import math
import time
import sys

targetNumber = 1000000

sys.setrecursionlimit(targetNumber + 1)

def checkPrime(i, j):
	if(j > _sqrt):
		# print(i)
		pass
	else:
		if(i % j != 0):
			checkPrime(i, j + 1)

# Timer start!
start = time.process_time()

# Initialize the bool
isPrime = True

# The sqrt of targetNumber
_sqrt = 0

# Smallest prime number
# print('2')

# Try from 3 to targetNumber.
# And the step is 2.
# Except 2, any other prime numbers are all odd.
i = 3
while(i <= targetNumber):
	# Reset in  every new loop
	_sqrt = int(math.sqrt(i))

	# At most check to its sqrt
	checkPrime(i, 3)

	# For next loop
	i = i + 2		

# Timer stop!
end = time.process_time()

# Count the elapsed time
elapsedTime = (end - start) * 1000

print('--------------------------------')
print('targetNumber is', targetNumber)
print('elapsedTime is ', elapsedTime, 'ms')
print('--------------------------------')