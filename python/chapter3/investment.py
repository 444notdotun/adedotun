
amount = 0
principal = 1000
annual_rate = principal/7
count = 1
while count <= 30:

	amount_accrued10 = principal+(1 + annual_rate)**count
	print(amount_accrued10 , "is the amount after ",count," years ")
	count+=1
