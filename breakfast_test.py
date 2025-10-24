import unittest
from breakfast_function import *

class test_breakfast(unittest.TestCase):
	def test_for_existence_to_change_string_to_uppercase(self):
		change_to_uppercase("string")
	
	def test_for_the_function_taking_only_string(self):
		expected = "enter a valid input"
		actual = change_to_uppercase("ade2")
		self.assertEqual(actual,expected)
	def test_for_the_function_pefroms_its_task(Self):
		expected = "ADE"
		actaul =change_to_uppercase("ade")
		