def get_4_letters(letters):
	output =""
	string_array =[]
	for count in letters:
		
		string_array.append(count)
		

	if len(string_array) >=2:
	
		output+= string_array[0]
		output+= string_array[1]
		output+= string_array[-2]		
		output+= string_array[-1]
		
	else:
		output = str("")

	return output


print(get_4_letters("so"))	