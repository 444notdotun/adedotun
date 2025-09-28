positive = 0
negative = 0
zero = 0
while(True):
	number = int(input("enter a number : "))
	if number > 0:
		positive+=1
		
	if number < 0:
		negative+=1

	if number == 0:
		zero+=1

	break_input = input("do you want to break(yes or no)?")
	if break_input == "yes":
		break


print("positive is " ,positive)
print("negative is",negative)
print("zero is ",zero)





