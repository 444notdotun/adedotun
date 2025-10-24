numbers= [1,2,3,4,5]
def score_of(numbers):
	return numbers**2

output = list(map(score_of,numbers))
print(output)




words= ["apple","banana","cherry"]
def length_of(words):
	return len(words)

output = list(map(length_of,words))
print(output)



numbers = [1,2,3,4,5,6]
def is_even(numbers):
	return numbers%2==0
		
output = list(filter(is_even,numbers))
print(output)


words =["apple","banana","kiwi","grapes","cherry"]
def is_even(numbers):
	return len(numbers) <= 5

output = list(filter(is_even,words))
print(output)

from functools import reduce
words =["i","love","python","snacks"]
def word_of(words,word):
	return words + "-" + word
output = reduce(word_of,words)
print(output)



