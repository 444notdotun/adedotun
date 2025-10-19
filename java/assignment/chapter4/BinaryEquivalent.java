"""
prompt user for an input and saave the input as number
use count as a container holding value 1
use multiple as a container holding value 0
use modulus as a container holding value 0
use total as a container holding value 0
modulate division by 10 , multiply it  with the value of count , add the mutiplied value to total and divide division with 10, increment by 2, do this in every iteration until division is 0 and terminate the loop
print total.
"""


number =int(input("enter a binanry number"))
count = 1
multiple = 0
modulus = 0
total = 0
division = number
while division != 0:
	modulus = division % 10
	multiple = modulus * count

	total+=multiple

	division = division / 10
	count+=2
				
print(total)
					

