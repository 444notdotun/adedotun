import unittest
from function_back_to_sender import *
class test_back_to_sender(unittest.TestCase):
	def test_if_get_amount_per_pacel_avaliable(self):
		get_amount_per_pacel(pacel_input=0)
	
	def test_get_amount_per_pacel_for_result_less_than_50(self):
		expected =  6280
		actual = get_amount_per_pacel(8)
		self.assertEqual(expected,actual)

	def test_get_amount_per_pacel_for_result_greater_than_50_and_less_than_59(self):
		expected = 15000
		actual = get_amount_per_pacel(50)
		self.assertEqual(expected,actual)

	def test_get_amount_per_pacel_for_result_greater_than_60_and_less_than_69(self):
		expected = 22250
		actual = get_amount_per_pacel(69)
		self.assertEqual(expected,actual)

def test_get_amount_per_pacel_for_result_greater_than_60_and_less_than_69(self):
		expected = 40000
		actual = get_amount_per_pacel(69)
		self.assertEqual(expected,actual)
