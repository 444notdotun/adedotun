prime_number = int(input("enter a positive number: "))
if prime_number < 1:
	print("enter a positive number")
else:
	for number in range (2,6):
		division = prime_number %  number
		if division == 0:
			print("it is not a prime number")
			break 
			
		
if division > 0:
	print("it is  a prime number")

