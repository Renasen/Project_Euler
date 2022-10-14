import constant
import math

largestPrimeFactor = -1

def isPrime(n):
	if n == 2 or n == 3 or n == 5 or n == 7:
		return True
	elif n % 2 == 0 or n == 1:
		return False
	else:
		for i in range(3,int(math.sqrt(n))):
			if n % i == 0:
				return False
		return True

for i in range(1,int(math.sqrt(constant.NUM))):
	if constant.NUM % i == 0:
		if isPrime(i):
			largestPrimeFactor = i

print(largestPrimeFactor)