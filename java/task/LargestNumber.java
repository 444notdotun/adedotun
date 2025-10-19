"""
prompt user for 3 inputs and save them as (input1, input2,input3)
resave one of the numbers to be compared to  others to determine the largest number.
check if the first value is greater than the resave value, print the number as the highest, if not,
check if the third value is grater than the resaved value , print the number , if not, 
print second value as the highest
"""

input1 =int(input("enter number 1"))
input2 =int(input("enter number2"))
input3 =int(input("enter number3"))
largest = input2

if input1 > largest:
	largest = input1
	print("The largest is",input1)

if input3 > largest:
	largest = input3
	print("The largest is",input3)

else:
	print("The largest is",input2)
			
smallest = input3
if input1 < smallest:
	smallest = input1
	print("The smallest is",input1)
if input2 < smallest:
	smallest = input2
	print("The smallest is",input2)
else:	
	print("The smallest is",input3)

sum = input1+input2+input3
print(sum)
average = sum/3
print(average)
product = input1*input2*input3
print(product)

