
def access_third_element(nums):
	return nums[2]



print(f'the third element in the list {access_third_element([10,20,30,40,50])}')

def  change_last_color(color):
	color.pop(2)
	color.insert(2,"yellow")
	return color


print(f'the third element in the list {change_last_color(['red','green','blue'])}')

def append(color):
	color.append('purple')
	return color


print(f'the third element in the list {append(['red','green','blue'])}')

def remove(list):
	list.remove(3)
	return list

print(f'the third element in the list {remove([1,2,3,4,5])}')


def length_list(color):
	count = 0
	counter = 0
	new=''
	start=[]
	for i in range (3):
		
		new+= color[count]
		count+=1
		for us in new:
			counter+=1
		start.append(counter)
		counter = 0
		new=''	
	return	start
		
		
		

print(length_list(['alice', 'bob' , 'kings']))



def ascending(list):
	list.sort()
	return list
				


print(ascending([4,1,3,9,2]))


def new_list(list):
	new = []
	for count in range(len(list)-1):
		if list[count] % 2 == 0:
			new.append(list[count])

	return new
		

print(new_list([2,4,7,9,49]))	



def combine(list1,list2):

	return list1+list2

print(combine([1,2,3,4],[1,2,33,33,34]))



def string_list(list):
	count = 0
	counter = 0
	new=''
	start=[]

	for i in range(len(list)):
		new+= list[count]
		count+=1
		for us in new:
			counter+=1
		if counter == 3:
			start.append(new)
		counter = 0
		new=''	
	return start
print(string_list(["lamb","kit","yam","kings","dogs","man"]))
