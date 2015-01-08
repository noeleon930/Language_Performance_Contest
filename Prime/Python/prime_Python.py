import math
import time

targetNumber = 10000

# Timer start!
start = time.process_time()

# Initialize the bool
isPrime = True

# Pre-set the sqrt of targetNumber
_sqrt = 0

# Smallest prime number
print('2')

# Try from 3 to targetNumber.
# And the step is 2.
# Except 2, any other prime numbers are all odd.
for i in range (3, targetNumber + 1, 2):
	# Reset in every new loop
	isPrime = True
	_sqrt = int(math.sqrt(i))
	
	# At most check to its sqrt.
	for j in range (3, _sqrt + 1):

		if (i % j) == 0:
			isPrime = False
			break
	
	if (isPrime):
		print(i)

# Timer stop!
end = time.process_time()

# Count the elapsed time
elapsedTime = (end - start) * 1000

print('--------------------------------')
print('targetNumber is', targetNumber)
print('elapsedTime is ', elapsedTime, 'ms')
print('--------------------------------')