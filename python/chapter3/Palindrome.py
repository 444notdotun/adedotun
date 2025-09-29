new_number =int(input("enter a palindrome: "))
last_numbers = 0
first_numbers = 0
last_num1 =  0
last_num2 = 0
first_num1 = 0
first_num2 = 0
count = 0
while(count < 1):
	if new_number >=10000 and newnumber <= 99999:
		last_numbers = new_number % 100
		first_numbers = new_number // 1000
		last_num1 = last_numbers % 10
		last_num2 = last_numbers // 10
		first_num1 = first_numbers % 10
		first_num2 = first_numbers // 10
				
		if last_num1 == first_num2 and last_num2 == first_num1:
			print("it is a palindrome")
			count+=1
		else:
			print("it is not a palindrome")
			count+=1
		
			
	elif (new_number < 10000 or new_number > 99999):
		print("invalid value!")
		
		new_number = int(input("enter a palindrome: "))
