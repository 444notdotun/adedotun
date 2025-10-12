def  get_square(array):
	
	new_array = []
	for count in array:
		new_array.append(count*count)
		
	
	return new_array

print(get_square([2,3,4,5,7]))	