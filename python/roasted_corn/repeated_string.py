def repeated_string(string, number):
	total=""
	if number % 1 > 0:
		return string
	for count in range(number):
		total+=string
	return total




print(repeated_string("hello",3.8))