numbers = ["1","2","3"]
print(list(map(lambda x: int(x),numbers)))
numbers =[0,5,10,15]
print(list(map(lambda x: x+10,numbers)))
numbers=[0,20,37,100]
print(list(map(lambda x:x*1.8+32,numbers)))
numbers=[1,None,3,None,5]
print(list(filter(lambda x : x != None,numbers)))
numbers=[1,3,4,6,9,12]
print(list(filter(lambda x: x%3==0,numbers)))
numbers=[-2,-1,0,1,2]
print(list(filter(lambda x: x > 0,numbers)))
numbers =[{"name":"alice","age":30},{"name":"bob","age":20}]
print(list(filter(lambda x: x > 25,{ numbers[count].get("age") for count in range(0,len(numbers))})))
from functools import*
numbers=[1,2,3,4,5]
print(reduce(lambda x,y:x+y,numbers))
numbers =[2,3,4]
print(reduce(lambda x,y: x*y,numbers))
numbers=[3,7,2,9,1]
def max_of(x,y):

	if x > y:
		y = x
	
	return y

print(reduce(max_of,numbers))
numbers=["Hello"," ","World"]
print(reduce(lambda x,y:x+y,numbers))
numbers=[1,2,3]
print(reduce(lambda x,y:x+y**2,numbers))
numbers=[{"a":1},{"b":2},{"c":3}]
print(reduce(lambda x,y:x|y,numbers))
