smallest = random_numbers_list[1]
for numbers in random_numbers_list:
	if numbers < smallest:
		smallest = numbers
print(smallest)
print(random_numbers_list)