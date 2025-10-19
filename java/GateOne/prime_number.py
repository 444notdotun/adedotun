
prime_number = int(input("enter a positive number: "))
division = 0
if prime_number < 1:
		print("invalid input enter a positive number")
if prime_number ==1:
	print("it is not a prime number")
			
else:
	import math
	number =int( math.sqrt(prime_number))
	number+=1
	for numbers in range (2,number):
		
		division = prime_number %  numbers
		if division == 0 and numbers < number :
			print("it is not a prime number")
			break 
		
		
if division > 0:
	print("it is  a prime number")