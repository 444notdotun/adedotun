def designated_list(list):
	total = 0
	middle = 0
	total+=list[0]
	total+=list[len(list)-1]
	
	middle=list[len(list)//2]+list[(len(list)//2)+ 1]/2
	total+=middle
	print(total)
	print([(len(list)//2)+ 1])
	print([(len(list)//2)])

designated_list(number_list)
