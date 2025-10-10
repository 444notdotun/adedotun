import random

random_numbers_list = []
for numbers in range (10):
	random_numbers_list.append(random.randint(1,50))
print(random_numbers_list)



print()
print()

count = 0
for numbers in random_numbers_list:
	count+=1
print(count)

print()
print()

count =0
sum_of_even = 0
for numbers in random_numbers_list:
	
	if count%2==0:
		sum_of_even+=numbers
	count+=1
print(sum_of_even)

print()
print()
count =0
sum_of_odd=0
for numbers in random_numbers_list:
	
	if count%2 > 0:
		sum_of_odd+=numbers
	count+=1
print(sum_of_odd)

print()
print()
'''

count =2

multiply_3rd_position=1
for numbers in random_numbers_list:
	if count < len(random_numbers_list):
		multiply_3rd_position*=random_numbers_list[count]
	else:
		break
	

	count+=3
print(multiply_3rd_position)


print()
print()


count =0
average=0
sum=0
for numbers in random_numbers_list:
	sum+=numbers
	count+=1
average = sum/count
print(average)


print()
print()


largest =random_numbers_list[0]
for numbers in random_numbers_list:
	if numbers > largest:
		largest = numbers
print(largest)
print(random_numbers_list)


print()
print()



smallest = random_numbers_list[1]
for numbers in random_numbers_list:
	if numbers < smallest:
		smallest = numbers
print(smallest)
print(random_numbers_list)



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
