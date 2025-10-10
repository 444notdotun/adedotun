count = 0
string = [ 'oyinade', 'emma', 'adaa' ,'nife' ,'kunle']
for number_of_strings in  string:
	
	if number_of_strings == string[count]:
		new_element = str(string[count])

		
			

		if len(new_element) >= 2:
			if new_element[0] == new_element[len(new_element)-1]:
				print(number_of_strings)
			else:
				print(f' first and the last character are different')
	

	count+=1