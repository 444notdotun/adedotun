
from university_function import *
from university_function2 import *

available_courses=["math", "physics", "computer", "biology", "chemistry", "statistics", "english", "economics", "history", "philosophy", "sociology", "political", "geography", "psychology", "art", "music", "engineering", "law", "medicine", "business"]

offered_courses=set()

records={}

while True:

	print(main_menu())
	menu_input=input("enter an input: ")
	match menu_input:
		case "1":
			key = input("enter a desired username: ")
			name = input("what is your name?: ")
			age = input("what is your age: ")
			city = input("what city are you from?: ")
			zip_code = input("what is your city zip_code code: ")
			
			while True:
				print(add_courses())
				courses_input = input("enter a course: ").lower() 
				print(course_compiler(records,courses_input,offered_courses,available_courses))
				choice = input("DO YOU WANT TO ADD MORE COURSE(YES/NO)?").lower()
				match choice:
					case "yes":
						print("good student")
					case "no":
						break
					case _:
						print("enter a value input")

			print(filling_student_records(records, name, age, city, zip_code, key, offered_courses))

		case "2":
			while True:
				print(view_menu())
				view_input = input("enter an input: ")
				match view_input :
					case "1":
						id_input = input("enter your unique ID: ")
						print(display_student_details(id_input,records))
					case "2":
						id_input = input("enter your unique ID: ")
						print(display_course_for_particular_student(id_input,records))
					case "3":
						id_input=input( "enter your unique ID:")
						print(display_zip_for_particular_student(id_input,records))
					case "4":
						break
					case _:
						print("enter a valid input")



		case "3":
			while True:
				print(update_menu())
				update_input = input("enter an input: ")
				match update_input:
					case "1":
						id_input = input("enter your unique ID: ")
						value_input = input("enter the course to update: ")
						print(update_course(offered_courses,value_input,id_input,records))

					case "2":
						id_input = input("enter your unique ID: ")
						new_details_input = "0"
						details_input = input("enter the details to update: ").lower()
						if details_input == "address":
							new_details_input = input("enter the details to update(city/zip_code: ")
						new_value_input = input("enter the new value to update: ")
						print(update_student_age_name(id_input,details_input,records,new_value_input,new_details_input))

					case "3":
							break
					case _:
						print("enter a valid input")

		case "5":
			print("SEE YOU SOON")
			break

		case "4":
			print(display_numbers_in_the_dict(records))

		case _:
			print("enter a valid input")










