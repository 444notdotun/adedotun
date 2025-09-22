x = 42
y = 12
z = 55

largest = y
secondlargest = 0

if x > largest:
	largest = x
	secondlargest = largest
elif z > largest:
	largest = z
	secondlargest = largest


print(secondlargest)
	