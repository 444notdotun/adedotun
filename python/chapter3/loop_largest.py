number = int(input("enter a number: "))
largest = number
second_largest = 0
count = 1
while(count < 10):
	newnumber = int(input("enter a number"))
	if newnumber > largest:
		largest = newnumber
	if newnumber < largest and newnumber > second_largest:
		second_largest = newnumber
	count+=1
print("second",second_largest)
print("largest",largest)