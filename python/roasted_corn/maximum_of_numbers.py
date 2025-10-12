def maximum_of_numbers(number):
	maximum = number[0]
	
	counter = 0
	for count in number:
		if number[counter] > maximum:
			
			maximum = number[counter]
		counter+=1

	return maximum
print(maximum_of_numbers([8,9,4,8,2,1]))