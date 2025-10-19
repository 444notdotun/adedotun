 
number =int(input("enter a number: "))			
mod = 0
div = number
addmod = 0
while(div > 0){
	mod = div % 10
				
												
	addmod += mod
	print(addmod)
	addmod = 0
	div = div // 10
			



