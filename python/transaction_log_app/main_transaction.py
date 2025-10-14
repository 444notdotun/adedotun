from transaction_log import *
account_balance =0
transactions=[]

while True:
	menu = """
		1->DEPOSIT
		2->WITHDRAW
		3->SHOW TRANSACTIONS
		4->EXIT
		"""
	
	account_input = input(f"{menu}: ")
	match account_input:
		case "1":
			amount = float(input("enter deposit amount: "))
			account_balance =deposit(amount,account_balance)
			transactions.append(f"Deposited:#{amount}| New Balanace:#{account_balance}")
			print(f"Deposited:#{amount}| New Balanace:#{account_balance}")
			
			
		case "2": 
			amount = float(input("enter withdrawal amount: "))
			account_balance=withdraw(amount,account_balance)
			transactions.append(f"wihdrew:#{amount}| New Balanace:#{account_balance}")
			print(f"withdrew:#{amount}| New Balanace:#{account_balance}")
		case"3":
			print("Transaction so far: ")
			show_transactions(transactions)

		case "4":
			print(f"final balance:{account_balance}")
			print("Thank you for using Transaction log App")
			break
		case _:
			print("invalid input")
			