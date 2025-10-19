def my_discount(price, discount):
	discount = discount / 100
	sum = price * discount
	total = price - sum
	
	return total




print(my_discount(150,15))