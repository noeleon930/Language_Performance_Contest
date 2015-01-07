import math
import time

targetNumber = 10000

# Timer start!
start = time.process_time()

# Initialize the bool
isPrime = True

# Smallest prime number
print('2')

# Try from 3 to targetNumber.
# And the step is 2.
# Except 2, any other prime numbers are all odd.
for i in range (3, targetNumber + 1, 2):
	# Reset to true in every new loop
	isPrime = True
	
	# At most check to its sqrt.
	for j in range (3, int(math.sqrt(i)) + 1):

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