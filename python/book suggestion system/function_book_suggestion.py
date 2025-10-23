import random
book=["i want to die", "chrome heart", "iphone","tales of the moon ","eye aye","peace", "ape in the zoo","demon slayer", "egbon adugbo"]
def get_random_page():
	result = random.randint(1,100)
	return result
 

def get_random_book_suggestion(book):
	return random.choice(book)

def add_book(input,book=[]):
	for count in book:
		if input == count:
			return ("Book exist")
	book.append(input)
	return ("Book added succesfully!")

def remove_book(input,book=[]):
	book.remove(input)
	return "Book removed succesfully!"

def update_book(input,data,book=[]):
		counter=0
		for count in book:
			if input == count:
				break
			counter+=1
			
		book[counter]= data
		
		return "Book updated successfully"
def show_books(book):
	
	for count in book:
		print (count)
	 	
	



		