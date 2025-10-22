from datetime import date
def dispenser_main_menu():
	main_menu = """
========================
WELCOME TO GBEDA STATION!
========================
1-> BUY PETROLEUM
2-> SHOW TRANSACTION HISTORY
3-> EXIT

=========================
"""

	return main_menu
def buy_menu():
	buy_menu = """
=========================
AVAILABLE PETROLEUM
=========================
1-> PETROL ==> 650/LITER
2-> DISEL ==>  720/LITER
3-> KEROSENE ==> 550/LITER
4-> GAS ==> 480/LITER
5-> BACK
==========================
		"""
	return buy_menu

def buy_petrol_in_amount(amount,transaction=[]):
	if amount < 650:
		return "enter a valid number above 649"
	 
	petrol_price = 650
	if amount%petrol_price == 0:
		liters = amount/petrol_price
	else:
		liters =amount/petrol_price
	receipt =f"""
=========================================
+	PRODUCT: petrol			+
+	AMOUNT: {amount:6}		+
+	LITERS:{liters:>6,.2f}		+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================


	"""
	today =date.today()
	receipt_history = f"""
=========================================
+	PRODUCT: petrol			+
+	AMOUNT: {amount}		+
+	LITERS:{liters:.2f}		+
+	{today} 			+
=========================================
	"""
	
	transaction.append(receipt_history)
	

	return receipt



def buy_diesel_in_amount(amount,transaction=[]):
	if amount < 720:
		return "enter a valid number above 719"
	diesel_price = 720
	if amount%diesel_price == 0:
		liter = amount/diesel_price
	else:
		liter = amount//diesel_price
	receipt =f"""
=========================================
+	PRODUCT: diesel			+
+	AMOUNT: {amount}		+
+	LITERS:{liter:.2f}		+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================


	"""
	today =date.today()
	receipt_history = f"""
=========================================
+	PRODUCT: diesel			+
+	AMOUNT: {amount}		+
+	LITERS:{liter:.2f}		+
+	{today} 			+
=========================================
	"""

	transaction.append(receipt_history)
	

	return receipt


def buy_petrol_in_liters(liters,transaction=[]):
	if liters <= 0:
		return "enter a valid number above 0"
	if liters > 50:
		return "enter a valid number below 50"



	petrol_liters = 650
	amount = petrol_liters*liters
	receipt= f"""
=================================
= PRODUCT: petrol		=
= AMOUNT: {amount}		=
= LITERS: {liters}		=
= THANK YOU FOR THE PETRONAGE	=
=================================
================================

	"""

	today =date.today()
	receipt_history = f"""
=========================================
+	PRODUCT: petrol			+
+	AMOUNT: {amount}		+
+	LITERS:{liters:.2f}		+
+	{today} 			+
=========================================
	"""

	transaction.append(receipt_history)
	return receipt



def buy_diesel_in_liters(liters,transaction=[]):
	if liters <= 0:
		return "enter a valid number above 0"
	if liters > 51:
		return "enter a valid number below 50"

	diesel_liters = 720
	amount = diesel_liters*liters
	receipt= f"""
=================================
= PRODUCT: diesel		=
= AMOUNT: {amount}		=
= LITERS: {liters}		=
= THANK YOU FOR THR PETRONAGE	=
=================================
================================

	"""

	today =date.today()
	receipt_history = f"""
=========================================
+	PRODUCT: diesel			+
+	AMOUNT: {amount}		+
+	LITERS:{liters:.2f}		+
+	{today} 			+
=========================================
	"""
	transaction.append(receipt_history)
	return receipt


def buy_kerosense_in_amount(amount,transaction=[]):
	if amount < 550:
		return "enter a valid number above 0"
	

	kerosense_price = 720
	if amount%kerosense_price == 0:
		liter = amount/kerosense_price
	else:
		liter = amount//kerosense_price
	receipt =f"""
=========================================
+	PRODUCT: kerosense		+
+	AMOUNT: {amount}		+
+	LITERS:{liter:.2f}		+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================


	"""
	today =date.today()

	receipt_history = f"""
=========================================
+	PRODUCT: kerosense		+
+	AMOUNT: {amount}		+
+	LITERS:{liter:.2f}		+
+	{today}			+
=========================================
	"""

	transaction.append(receipt_history)
	

	return receipt


def buy_kerosense_in_liters(liters,transaction=[]):
	if liters <= 0:
		return "enter a valid number above 0"
	if liters > 51:
		return "enter a valid number below 50"

	kerosense_liters = 550
	amount = kerosense_liters*liters
	receipt= f"""
=================================
= PRODUCT: kerosense		=
= AMOUNT: {amount}		=
= LITERS: {liters}		=
= THANK YOU FOR THR PETRONAGE	=
=================================
================================

	"""
	today =date.today()

	receipt_history = f"""
=========================================
+	PRODUCT: kerosense		+
+	AMOUNT: {amount}		+
+	LITERS:{liters:.2f}		+
+	{today}				+
=========================================
	"""
	transaction.append(receipt_history)
	return receipt


def buy_gas_in_amount(amount,transaction=[]):
	if amount < 480:
		return "enter a valid number"

	gas_price = 720
	if amount%gas_price == 0:
		liter = amount/gas_price
	else:
		liter = amount//gas_price
	receipt =f"""
=========================================
+	PRODUCT: gas			+
+	AMOUNT: {amount}		+
+	LITERS:{liter:.2f}		+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================


	"""
	today =date.today()
	receipt_history = f"""
=========================================
+	PRODUCT: gas			+
+	AMOUNT: {amount}		+
+	LITERS:{liter:.2f}		+
+	{today} 			+
=========================================
	"""

	transaction.append(receipt_history)
	

	return receipt


def buy_gas_in_liters(liters,transaction=[]):
	if liters <= 0:
		return "enter a valid number above 0"
	if liters >51 :
		return "enter a valid number below 50"

	gas_liters = 480
	amount = gas_liters*liters
	receipt= f"""
=================================
= PRODUCT: gas			=
= AMOUNT: {amount}		=
= LITERS: {liters}		=
= THANK YOU FOR THR PETRONAGE	=
=================================
================================

	"""
	today =date.today()

	receipt_history = f"""
=========================================
+	PRODUCT: gas			+
+	AMOUNT: {amount}		+
+	LITERS:{liters:.2f}		+
+	{today} 			+
=========================================
	"""

	transaction.append(receipt_history)
	return receipt

def show_transaction_history(transaction=[]):
	if transaction == []:
		print("no transaction to display")
	for count in transaction:
		print(count)


