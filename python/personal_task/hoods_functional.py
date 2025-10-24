numbers = [1,2,3,4,5,6,7,8,9,10]
def square_of(number):
	return number**2

output = list(map(square_of,numbers))
print(output)

"""====================================="""
def even_of(number):
	return number%2==0

output = list(filter(even_of,numbers))
print(output)
"""======================================"""
def odd_of(number):
	return number%2>=1

def cubes_of(number):
	return number**3

output = list(map(cubes_of,list(filter(odd_of,numbers))))
print(output)
"""========================================"""
from functools import *

def sum_of(x,y):
	return x+y
	
output = reduce(sum_of,numbers)
print(output)
"""======================================="""
def max_of(number,y):
	
	if number > y:
		y = number
	
	return y
output = reduce(max_of,numbers)
print(output)
"""====================================="""
words = ["python", "programming", "data", "science", "learning", "challenge", "function", "variable", "loop", "string", "is", "fun"]

def length_of(number):
	return len(number)
output = list(map(length_of,words))
print(output)

"=================================="""
def lengths_of(number):
	return len(number)<4
output = list(filter(lengths_of, words))
print(output)
"""=============================="""
output = reduce(lambda x,y:x+y,words)
print(output)
"""==========================="""


my_dic =[
    {"name": "Alice", "age": 25, "city": "Lagos"},
    {"name": "Ben", "age": 30, "city": "Abuja"},
    {"name": "Clara", "age": 22, "city": "Port Harcourt"},
    {"name": "David", "age": 27, "city": "Enugu"},
    {"name": "Ella", "age": 35, "city": "Ibadan"},
    {"name": "Frank", "age": 29, "city": "Kano"},
    {"name": "Grace", "age": 24, "city": "Abeokuta"},
    {"name": "Henry", "age": 31, "city": "Jos"},
    {"name": "Ivy", "age": 28, "city": "Asaba"},
    {"name": "James", "age": 33, "city": "Uyo"}
]

output =list(filter(lambda x: x > 30,{ my_dic[count].get("age") for count in range(0,len(my_dic))}))
print(output)


"""============================"""

print(list(map(lambda x:x.get("name"), my_dic)))




	