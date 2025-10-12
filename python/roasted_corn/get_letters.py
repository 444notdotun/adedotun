def get_letters(letters):
	output =''
	string_array =[]
	another_letter = "ing"
	ing_list = []

	for counter in another_letter:
		ing_list.append(counter)

	ly_letter = "ly"
	ly_list = []
	for counters in ly_letter:
		ly_list.append(counters)

	
	
	for count in letters:
		
		string_array.append(count)

	if len(string_array) > 2:

		if string_array[-1] and string_array[-2] and string_array[-3] != ing_list[0] and ing_list[1] and ing_list[2]:
			counting = 0
			for count in letters:
				output+= string_array[counting]
				counting+=1

				if counting == len(string_array):
					number = 0
					for counter in another_letter:
						output+= ing_list[number]
						number+=1

		else:
			counting = 0
			for count in letters:
				output+= string_array[counting]
				counting+=1

				if counting == len(string_array):
					number = 0
					for counter in ly_letter:
						output+= ly_list[number]
						number+=1
	else:
		counting = 0
		for count in letters:
			output+= string_array[counting]
			counting+=1

	return(output)
	

print(get_letters("ab"))


















	