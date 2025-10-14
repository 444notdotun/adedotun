
def deposit(amount, account_balance=0,transactions=[]):
	account_balance = amount + account_balance
	
	return  account_balance


def withdraw(amount,account_balance,transactions=[]):
	if amount > account_balance:
		okay=f"Withdrawal failed:insufficient funds"
		return okay
	
	account_balance = account_balance-amount
	
	return (account_balance)


def show_transactions(transactions):	
	if transactions == []:
		print(f" no transactions yet")
	for i in transactions:
			
		print( i)
		


	