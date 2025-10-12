def minimum_of_numbers(number):
	minimum = number[0]
	
	counter = 0
	for count in number:
		if number[counter] < minimum:
			
			minimum = number[counter]
		counter+=1

	return minimum
print(minimum_of_numbers([8,9,4,8,2,1]))
		