


def filling_student_records(records, name, age, city, zip_code, key, offered_courses, ):
	if not city.isalpha():
		return "INVALID INPUT IN CITY SECTION!"	
	if not age.isdigit():
		return "INVALID INPUT IN AGE SECTION!"

	records[key]={"name":name,"age":age,"course":offered_courses,"address":{"city":city,"zip_code":zip_code}}

	return "REGISTERED"



def course_validator(course,available_courses):
	if course.isalpha():
		if course in available_courses:
			return "REGISTERED!"
		else:
			return "COURSE NOT AVAILABLE"
	else:
		return "ENTER A VALID INPUT!"

def course_compiler(records,course,offered_courses,available_courses):
	if course_validator(course,available_courses) == "REGISTERED!":
		if len(records) > 0:
			offered_courses = set()
		if course not in offered_courses:
			offered_courses.add(course)
			return offered_courses
		else:
			return "YOU ALREADY OFFER THE COURSE!"
	return "COURSE NOT AVAILABLE"

def id_checker(id_name, records):
	if not id_name in records:
		return "WRONG USERNAME!"
	return "PASS"
	

def display_course_for_particular_student(id_name, records):
	if id_checker(id_name, records)== "PASS":
		return records[id_name].get("course")
	return "WRONG USERNAME!"

def display_zip_for_particular_student(id_name, records):
	if id_checker(id_name, records)== "PASS":
		return records[id_name]["address"].get("zip_code")
	return "WRONG USERNAME!"

def display_city_for_particular_student(id_name, records):
	if id_checker(id_name, records)== "PASS":
		return records[id_name]["address"].get("city")
	return "WRONG USERNAME!"


def update_course(offered_courses, value, id_name, records):
	if id_checker(id_name, records) == "PASS":
		if value in offered_courses:
			offered_courses.discard(value)
			return offered_courses
		return "YOU DO NOT OFFER THIS COURSE"
	return "WRONG USERNAME!"

def update_student_age_name(id_name, details, records, new_value, details2):
	if id_checker(id_name, records) == "PASS":
		if details == "address":
			records[id_name][details][details2]=new_value
			return f"YOU UPDATED {details2} to {new_value}"
		else:
			if details in records[id_name]:
				records[id_name][details]=new_value
				return f"YOU UPDATED {details} to {new_value}"
			return "WRONG DETAILS"
	return "WRONG USERNAME!"
	

def display_numbers_in_the_dict(records):
	return len(records)

def display_student_details(id_name, records):
	if id_checker(id_name, records) == "PASS":
		return records.get(id_name)
	return "WRONG USERNAME!"



	
