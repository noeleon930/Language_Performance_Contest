import math
import time

targetNumber = 1000000

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
	isPrime = True
	j = 3
	_sqrt = int(math.sqrt(i))

	while(j <= _sqrt and isPrime == True):
		if(i % j == 0):
			isPrime = False
		j = j + 1

	# if (isPrime):
	# 	print(i)

	i = i + 2		

# Timer stop!
end = time.process_time()

# Count the elapsed time
elapsedTime = (end - start) * 1000

print('--------------------------------')
print('targetNumber is', targetNumber)
print('elapsedTime is ', elapsedTime, 'ms')
print('--------------------------------')