def only_floats (number1, number2):
	if number1 % 1 > 0 and number2 % 1 > 0:
		output = 2
		 
	elif number1 % 1 > 0 or number2 % 1 > 0:
		 output = 1
			
		
	else:
		output = 0
		

	return output

	




print(only_floats(22 , 13))