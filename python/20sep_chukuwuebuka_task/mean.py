a = 7
b = 3
c = 12
d = 9

largest = a
secondlargest = 0
smallest = c
second_smallest = 0

if b > largest:
	
	secondlargest = largest
	largest = b
if c > largest:
	
	secondlargest = largest
	largest = c
if d > largest:
	
	secondlargest = largest
	largest = d

if d < smallest:  
	
	second_smallest = smallest
	smallest = d
if b < smallest:
	
	
	second_smallest = smallest
	smallest = b
if a < smallest:
	
	second_smallest = smallest
	smallest = a

print(smallest,second_smallest,secondlargest,largest )
median = second_smallest + secondlargest / 2
print("median is",median)
sum = smallest + second_smallest + secondlargest + largest
print("sum is", sum)
mean = sum / 4
print("mean is", mean)