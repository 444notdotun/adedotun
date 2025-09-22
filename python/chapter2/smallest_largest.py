num1 = int(input("enter number1: "))
num2 = int(input("enter number2: "))
num3 = int(input("enter number3: "))

sum = num1 + num2 + num3
print("sum of the input is" ,sum)
average = sum / 3
print("average is ", average)

largest = num1 
smallest = num2

if num2 > largest:
	largest = num2
 
if num3 > largest:
	largest = num3

print("largest is", largest)

if num1 < smallest:
	smallest = num2 
if num3 < smallest:
	smallest = num3

print("smallest is", smallest)
