wp = 8142000000
dgr = 1.0
count = 1
while count <= 100:
	import math
	population = wp * math.pow(dgr,count)
	
	print(" estimated population for year" ,count ,"is", population)
	count +=1	