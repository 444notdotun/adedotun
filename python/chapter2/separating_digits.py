number = int(input("enter a number(5digits): "))

if number >= 10000 & number <= 99999:
	num1 = number // 10000
	tempnum = number // 1000
	num2 = tempnum % 10
	tempnum = number //100
	num3 = tempnum % 10
	tempnum = number //10
	num4 = tempnum % 10
	num5 = number % 10
	print(num1,num2,num3,num4,num5)
else:
	print("enter a valid input")