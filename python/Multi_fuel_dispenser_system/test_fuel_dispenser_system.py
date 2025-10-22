import unittest
from function_of_fuel_dispenser_system import *
class test_fuel_dispenser_system(unittest.TestCase):
	def test_for_dispenser_main_menu(self):
		dispenser_main_menu()
	def test_for_dispenser_main_menu_output(self):
		actual = dispenser_main_menu()
		self.assertTrue(actual)
	def test_for_buy_menu_is_avaliable(self):
		buy_menu()
	def test_for_buy_menu_return(self):
		actual = buy_menu()
		self.assertTrue(actual)
	def test_if_buy_petrol_in_amount_active(self):
		buy_petrol_in_amount(amount=0,transaction=[])
	
	def test_buy_petrol_in_amount_test_for_int(self):
		expected ="""
=========================================
+	PRODUCT: petrol			+
+	AMOUNT: {amount}		+
+	LITERS:{liters}			+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================

Saving transcation History......
		"""
		actual =buy_petrol_in_amount(amount= 100,transaction=[])
		self.assertTrue(expected,actual)
	def test_buy_petrol_in_amount_if_it_passes_negative(self):
		expected ="enter a valid number"
		actual = buy_petrol_in_amount(amount= -2,transaction=[])
		self.assertEqual(expected,actual)
	def test_buy_petrol_in_amount_if_it_passes_zero(self):
		expected ="enter a valid number"
		actual = buy_petrol_in_amount(amount= 0,transaction=[])
		self.assertEqual(expected,actual)


	def test_if_buy_diesel_in_amount_active(self):
		buy_diesel_in_amount(amount=0,transaction=[])
	
	def test_buy_diesel_in_amount_test_for_int(self):
		expected ="""
=========================================
+	PRODUCT: diesel			+
+	AMOUNT: {amount}		+
+	LITERS:{liters}			+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================

Saving transcation History......
		"""
		actual =buy_diesel_in_amount(amount= 100,transaction=[])
		self.assertTrue(expected,actual)
	def test_buy_diesel_in_amount_if_it_passes_negative(self):
		expected ="enter a valid number"
		actual = buy_diesel_in_amount(amount= -2,transaction=[])
		self.assertEqual(expected,actual)
	def test_buy_diesel_in_amount_if_it_passes_zero(self):
		expected ="enter a valid number"
		actual = buy_diesel_in_amount(amount= 0,transaction=[])
		self.assertEqual(expected,actual)

	def test_petrol_in_liters_test_for_int(self):
		expected ="""
=========================================
+	PRODUCT: petrol			+
+	AMOUNT: {amount}		+
+	LITERS:{liter}			+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================

Saving transcation History......
		"""
		actual = buy_petrol_in_liters(liters=100,transaction=[])
		self.assertTrue(expected,actual)
	def test_buy_petrol_in_liters_if_it_passes_negative(self):
		expected ="enter a valid number"
		actual =  buy_petrol_in_liters(liters= -2,transaction=[])
		self.assertEqual(expected,actual)
	def test_buy_petrol_in_liters_if_it_passes_zero(self):
		expected ="enter a valid number"
		actual =  buy_petrol_in_liters(liters= 0,transaction=[])
		self.assertEqual(expected,actual)

	def test_diesel_in_liters_test_for_int(self):
		expected ="""
=========================================
+	PRODUCT: diesel			+
+	AMOUNT: {amount}		+
+	LITERS:{liter}			+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================

Saving transcation History......
		"""
		actual = buy_diesel_in_liters(liters=100,transaction=[])
		self.assertTrue(expected,actual)
	def test_buy_diesel_in_liters_if_it_passes_negative(self):
		expected ="enter a valid number"
		actual =  buy_diesel_in_liters(liters= -2,transaction=[])
		self.assertEqual(expected,actual)
	def test_buy_diesel_in_liters_if_it_passes_zero(self):
		expected ="enter a valid number"
		actual =  buy_diesel_in_liters(liters= 0,transaction=[])
		self.assertEqual(expected,actual)


	def test_if_buy_kerosense_in_amount_active(self):
		buy_kerosense_in_amount(amount=0,transaction=[])
	
	def test_buy_kerosense_in_amount_test_for_int(self):
		expected ="""
=========================================
+	PRODUCT: kerosense			+
+	AMOUNT: {amount}		+
+	LITERS:{liters}			+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================

Saving transcation History......
		"""
		actual =buy_kerosense_in_amount(amount= 100,transaction=[])
		self.assertTrue(expected,actual)
	def test_buy_kerosense_in_amount_if_it_passes_negative(self):
		expected ="enter a valid number"
		actual = buy_kerosense_in_amount(amount= -2,transaction=[])
		self.assertEqual(expected,actual)
	def test_buy_kerosense_in_amount_if_it_passes_zero(self):
		expected ="enter a valid number"
		actual = buy_kerosense_in_amount(amount= 0,transaction=[])
		self.assertEqual(expected,actual)


	def test_kerosense_in_liters_test_for_int(self):
		expected ="""
=========================================
+	PRODUCT: kerosense			+
+	AMOUNT: {amount}		+
+	LITERS:{liter}			+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================

Saving transcation History......
		"""
		actual = buy_kerosense_in_liters(liters=100,transaction=[])
		self.assertTrue(expected,actual)
	def test_buy_kerosense_in_liters_if_it_passes_negative(self):
		expected ="enter a valid number"
		actual =  buy_kerosense_in_liters(liters= -2,transaction=[])
		self.assertEqual(expected,actual)
	def test_buy_kerosense_in_liters_if_it_passes_zero(self):
		expected ="enter a valid number"
		actual =  buy_kerosense_in_liters(liters= 0,transaction=[])
		self.assertEqual(expected,actual)


	def test_if_buy_gas_in_amount_active(self):
		buy_kerosense_in_amount(amount=0,transaction=[])
	
	def test_buy_gas_in_amount_test_for_int(self):
		expected ="""
=========================================
+	PRODUCT: gas			+
+	AMOUNT: {amount}		+
+	LITERS:{liters}			+
+	THNAK YOU FOR THE PETRONAGE	+
=========================================
=========================================

Saving transcation History......
		"""
		actual =buy_gas_in_amount(amount= 100,transaction=[])
		self.assertTrue(expected,actual)
	def test_buy_gas_in_amount_if_it_passes_negative(self):
		expected ="enter a valid number"
		actual = buy_gas_in_amount(amount= -2,transaction=[])
		self.assertEqual(expected,actual)
	def test_buy_gas_in_amount_if_it_passes_zero(self):
		expected ="enter a valid number"
		actual = buy_gas_in_amount(amount= 0,transaction=[])
		self.assertEqual(expected,actual)
		