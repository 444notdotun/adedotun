my_list = [3,14,7,21,8]
count = 0
counter= 1
counting= 1
us = 0
new =len(my_list)
for i in range(5):
	if my_list[count] > my_list[counter]:
		us=(my_list[counter])

		my_list[counter]=my_list[count]
			
		my_list[count]=us
			
			
	count+=1
	counter+=1
		
		
print(my_list)