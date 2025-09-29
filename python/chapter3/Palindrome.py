newnumber =int(input("enter a palindrome: "))
lastnumbers = 0
firstnumbers = 0
lastnum1 =  0
lastnum2 = 0
firstnum1 = 0
firstnum2 = 0
count = 0
while(count < 1):
	if newnumber >=10000 and newnumber <= 99999:
		lastnumbers = newnumber % 100
		firstnumbers = newnumber // 1000
		lastnum1 = lastnumbers % 10
		lastnum2 = lastnumbers // 10
		firstnum1 = firstnumbers % 10
		firstnum2 = firstnumbers // 10
				
		if lastnum1 == firstnum2 and lastnum2 == firstnum1:
			print("it is a palindrome")
			count+=1
		else:
			print("it is not a palindrome")
			count+=1
		
			
	elif (newnumber < 10000 or newnumber > 99999):
		print("invalid value!")
		
		newnumber = int(input("enter a palindrome: "))
