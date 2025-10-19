from function_book_suggestion import *
import random
while(True):
	menu="""
1-> GET SUGGESTIONS
2-> ADD BOOK
3-> REMOVE BOOK
4-> UPDATE BOOK
5-> SHOW BOOKS
6-> EXIT
	"""
	print(menu)
	menu_input = input("enter a number: ")
	match menu_input:
		
		case "1":
			while(True):
				book_of_the_day = get_random_book_suggestion(book)
				print("BOOK OF THE DAY:")
				
				print(f"BOOK TITLE: {book_of_the_day}") 
				
				print(f"PAGE:{get_random_page()}")
				suggeestion_input = input("would you like to get another suggestion?(yes/no): ")
				
				match suggeestion_input.lower():
					case "yes":
						print("""==========================
hehehe, let's go!""")
					case "no":
						print("""==========================
okay,cool""")
						break
					case _: print("""=========================
enter a valid input""")
		case "2":
			
			add_book_input= input("enter the book title: ").lower()
			print(add_book(add_book_input,book))


		case "3":
			remove_book_input =input("enter the book title to remove:  ").lower()
			print(remove_book(remove_book_input,book))
		case "4":
			update_book_input = input("enter the old title: ").lower()
			update_second_book = input("enter the new title: ").lower()
			print(update_book(update_book_input,update_second_book,book))
		case "5":
			print("ALL BOOKS:")
			show_books(book)
		case "6":
			break
		case _: 
			print("enter a valid input")
				