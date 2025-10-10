def third_element(list):
	count = 2
	total = 0
	for numbers in list:
		if count < len(list):
			total+=list[count]
		count+=3
	print(total)

third_element(number_list)