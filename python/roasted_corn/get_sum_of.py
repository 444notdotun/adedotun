def  get_sum_of(array):
	
	new_array = []
	total =0
	for count in array:
		new_array.append(count*count)
	for counter in new_array:
		total+=counter
	
	return total

print(get_sum_of([2,3,4,5,7]))	