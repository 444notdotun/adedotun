"""
prompt user for gallon used in each trip and 0 to end the program, save in the input as gallon
prompt user for miles used in each trip and save it in the input as miles.
 save variable count to 0
while usuing iteration the condition should be gallon greater than 0 in the body of the iteration,
"""



gallon = 0
miles = 0
count = 0
trips = 0
choice = 1
while(choice != 0):
	gallon = int(input("enter gallon used in a trip: "))
	miles = int(input("enter miles: "))			
	gas_mileage = gallon / miles
	trips += gas_mileage
	count+=1

	choice =int(input("do you want continue?, 0 to exit & any number to continue: "))
		
	print ("for", count ,"trips this is the total gas mileage",trips)
