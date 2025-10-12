def remove_odd_index(word):
	counter = 0
	total = ""
	for count in word:
		if counter % 2 > 0:
			total+=count
		counter+=1
		
		
	
	return total
print(remove_odd_index("semicolon"))