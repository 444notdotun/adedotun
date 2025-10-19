import unittest
from function_book_suggestion import *
class test_function_book_suggestion(unittest.TestCase):
	def  test_that_get_random_page_is_avaliable(self):
		get_random_page()

	def test_that_get_random_page_gives_a_random_page(self):
		first_test=get_random_page()
		second_test=get_random_page()
		self.assertNotEqual(first_test,second_test)
	def test_that_random_page_is_in_range(self):
		result = get_random_page() 
		self.assertTrue(result >=1 and result <=100)
		


	def test_that_get_random_book_suggestion_is_available(self):
		get_random_book_suggestion(book)

	def test_that_get_random_book_suggestion_doesnt_repeat(self):
		first_test=get_random_book_suggestion(book)
		second_test=get_random_book_suggestion(book)
		self.assertNotEqual(first_test,second_test)


	def test_that_get_random_book_suggestion_is_true(self):
		result = get_random_book_suggestion(book) 
		self.assertTrue(result,book)

	def test_that_add_book_is_avaliable(self):
		add_book(input,book)
	
	def test_that_add_book_adds_book(self):
		expected = "Book added succesfully"
		actual = add_book("dotun",book)
		self.assertEqual(expected,actual)
	def test_that_add_book_tells_bok_exist(self):
		expected = "Book exist"
		actual = add_book("nisi",book)
		self.assertEqual(expected,actual)
	def test_that_add_book_appends(self):
		expected = add_book("notme",book)
		self.assertTrue(expected,book)
	def test_that_remove_book_is_avaliable(self):
		remove_book(input,book)
	def test_that_remove_book_returns(self):
		expected = "Book removed succesfully"
		actual = remove_book("nisi",book)
		self.assertEqual(expected,actual)
		
	def test_remove_book_actaully_removes(self):
		remove_book("iphone",book)
		self.assertTrue

	"""def test_update_book_is_available(self):
		update_book(input,data,book=[])
	"""
	def test_update_book_index(self):
		
		expected =['i want to die', 'chrome heart', 'peace', 'dotun', 'notme','not']
		update_book("us","not",book)
		actual=book
		self.assertEqual(expected,actual)
	def test_update_book_returns(self):
		expected="Book updated successfully"
		actual = update_book("peace","good",book)
		self.assertEqual(expected,actual)

	def test_show_books_available(self):
		show_books(book)
	def test_show_books_output(self):
		expected = book
		actual =book
		self.assertEqual(expected,actual)