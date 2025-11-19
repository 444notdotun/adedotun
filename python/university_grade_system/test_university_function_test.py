import unittest
from university_function import*

available_courses=["Math", "Physics", "Computer Science", "Biology", "Chemistry", "Statistics", "English", "Economics", "History", "Philosophy","Sociology", "Political Science", "Geography", "Psychology", "Art","Music", "Engineering", "Law", "Medicine", "Business"]

class TestUniversityFunction(unittest.TestCase):
    def test_that_filling_student_records_works(self):
        records ={}
        offered_courses=set()
        course_compiler(records,"Math",offered_courses,available_courses)
        course_compiler(records,"Biology",offered_courses,available_courses)
        course_compiler(records,"Physics",offered_courses,available_courses)
        expected ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        expect = "REGISTERED"

        actual =filling_student_records(records,"adedotun","20","lagos","66-789","not",offered_courses,)

        self.assertEqual(expect,actual)


    def test_that_course_validator_works_returns_registered(self):

        expected ="REGISTERED!"
        actual = course_validator("Math",available_courses)
        self.assertEqual(expected,actual)

    def test_that_course_validator_does_not_accept_numbers_or_non_alphabet(self):
        expected = "ENTER A VALID INPUT!"
        actual = course_validator("Math1",available_courses)
        self.assertEqual(expected,actual)


    def test_that_course_validator_returns_course_not_offered(self):

        expected = "COURSE NOT AVAILABLE"
        actual=course_validator("civic",available_courses)
        self.assertEqual(expected,actual)

    def test_that_filling_student_returns_invalid_for_wrong_city(self):
        records={}
        offered_courses={}
        expected = "INVALID INPUT IN CITY SECTION!"
        actual =filling_student_records(records,"adedotun","20","lagos1","66-789","not",offered_courses,)

        self.assertEqual(expected,actual)

    def test_that_filling_student_returns_invalid_for_wrong_age(self):
        records={}
        offered_courses={}
        expected = "INVALID INPUT IN AGE SECTION!"
        actual =filling_student_records(records,"adedotun","20s","lagos","66-789","not",offered_courses,)

        self.assertEqual(expected,actual)

    def test_that_course_validator_returns_enter_a_valid_input(self):
        expected = "ENTER A VALID INPUT!"
        actual = course_validator("eng6",available_courses)
        self.assertEqual(expected,actual)

    def test_that_course_validator_returns_course_not_available(self):
        expected = "COURSE NOT AVAILABLE"
        actual = course_validator("civic",available_courses)
        self.assertEqual(expected,actual)

    def test_that_course_validator_returns_registered(self):
        expected = "REGISTERED!"
        actual = course_validator("Math",available_courses)
        self.assertEqual(expected,actual)

    def test_that_course_complier_returns_course_not_available(self):
        offered_courses=set()
        records={}
        expected="COURSE NOT AVAILABLE"
        actual= course_compiler(records,"civic",offered_courses,available_courses)
        self.assertEqual(expected,actual)

    def test_that_course_complier_returns_a_set(self):
        offered_courses=set()
        records={}
        expected={"Math"}
        actual= course_compiler(records,"Math",offered_courses,available_courses)
        self.assertEqual(expected,actual)

    def test_that_id_checker_returns_wrong_username(self):
        expected = "WRONG USERNAME!"
        records = {}
        offered_courses=set()
        course_compiler(records,"Math",offered_courses,available_courses)
        course_compiler(records,"Biology",offered_courses,available_courses)
        course_compiler(records,"Physics",offered_courses,available_courses)
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        actual =id_checker("me",records)
        self.assertEqual(expected,actual)
    def test_that_id_checker_returns_pass(self):
        expected = "PASS"
        records = {}
        offered_courses=set()
        course_compiler(records,"Math",offered_courses,available_courses)
        course_compiler(records,"Biology",offered_courses,available_courses)
        course_compiler(records,"Physics",offered_courses,available_courses)
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        actual =id_checker("not",records)
        self.assertEqual(expected,actual)

    def test_that_display_course_for_particular_student(self):
        expected = {"Math","Biology","Physics"}
        records = {}
        offered_courses=set()
        course_compiler(records,"Math",offered_courses,available_courses)
        course_compiler(records,"Biology",offered_courses,available_courses)
        course_compiler(records,"Physics",offered_courses,available_courses)
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        actual = display_course_for_particular_student("not",records)
        self.assertEqual(expected,actual)

    def test_that_display_course_for_particular_student_returns_wrong_username(self):
        expected = "WRONG USERNAME!"
        records = {}
        offered_courses=set()
        course_compiler(records,"Math",offered_courses,available_courses)
        course_compiler(records,"Biology",offered_courses,available_courses)
        course_compiler(records,"Physics",offered_courses,available_courses)
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        actual = display_course_for_particular_student("no",records)
        self.assertEqual(expected,actual)

    def test_that_display_zip_for_particular_student_returns(self):
        expected = "66-789"
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        actual = display_zip_for_particular_student("not",records)
        self.assertEqual(expected,actual)

    def test_that_display_zip_for_particular_student_returns_wrong_username(self):
        expected = "WRONG USERNAME!"
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        actual = display_zip_for_particular_student("no",records)
        self.assertEqual(expected,actual)

    def test_that_display_city_for_particular_student_returns(self):
        expected = "lagos"
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        actual = display_city_for_particular_student("not",records)
        self.assertEqual(expected,actual)

    def test_that_display_city_for_particular_student_returns_wrong_username(self):
        expected = "WRONG USERNAME!"
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        actual = display_city_for_particular_student("no",records)
        self.assertEqual(expected,actual)

    def test_that_course_complier_returns_a_you_already_offer_course(self):
        offered_courses={"Math",}
        records={}
        expected="YOU ALREADY OFFER THE COURSE!"
        actual= course_compiler(records,"Math",offered_courses,available_courses)
        self.assertEqual(expected,actual)
    def test_that_update_courses_updates(self):
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        offered_courses={"Math","Biology","Physics"}
        expected = {"Biology","Physics"}
        actual=update_course(offered_courses,"Math","not",records)
        self.assertEqual(expected,actual)

    def test_that_update_courses_returns_you_dont_offer_course(self):
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        offered_courses={"Math","Biology","Physics"}
        expected = "YOU DO NOT OFFER THIS COURSE"
        actual=update_course(offered_courses,"Economics","not",records)
        self.assertEqual(expected,actual)


    def test_that_update_student_age_name_returns_updated(self):
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        expected = "YOU UPDATED age to 22"
        actual =update_student_age_name("not","age",records,"22","none")
        self.assertEqual(expected,actual)

    def test_that_update_student_age_name_returns_wrong_username(self):
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        expected = "WRONG USERNAME!"
        actual =update_student_age_name("no","age",records,"22","address")
        self.assertEqual(expected,actual)
    def test_that_update_student_age_name_returns_update_on_address(self):
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        expected = "YOU UPDATED zip_code to 22"
        actual =update_student_age_name("not","address",records,"22","zip_code")
        self.assertEqual(expected,actual)


    def test_that_display_numbers_returns(self):
        records ={"not":{"name":"adedotun",
        "age":"20",
        "course":{"Math","Biology","Physics"},
        "address":{"city":"lagos",
                "zip_code":"66-789"}
        }}
        expected = 1
        actual = display_numbers_in_the_dict(records)
        self.assertEqual(expected,actual)

    def test_that_display_student_details_returns(self):
        records = {"not": {"name": "adedotun",
        "age": "20",
        "course": {"Math", "Biology", "Physics"},
        "address": {"city": "lagos",
                      "zip_code": "66-789"}
        }}
        recs ={"name": "adedotun",
        "age": "20",
        "course": {"Math", "Biology", "Physics"},
        "address": {"city": "lagos",
                      "zip_code": "66-789"}
        }
        expected = recs
        actual = display_student_details("not",records)
        self.assertEqual(expected,actual)


    def test_that_display_student_details_returns_wrong_password(self):
        records = {"not": {"name": "adedotun",
        "age": "20",
        "course": {"Math", "Biology", "Physics"},
        "address": {"city": "lagos",
                "zip_code": "66-789"}
        }}
        expected = "WRONG USERNAME!"
        actual = display_student_details("no", records)
        self.assertEqual(expected, actual)
