import math

def factor_of(number):
    count = 1
    factor = 0
    while count <= number:
        if number % count == 0:
            factor += 1
        count += 1
    return factor

def is_prime(prime_number):
    if prime_number == 1:
        return False
    number = math.sqrt(prime_number)
    number += 1
    count = 2
    while count <= number:
        division = prime_number % count
        if division == 0 and count < number:
            return False
        count += 1
    return True

def is_odd(number):
    return number % 2 > 0

def is_leap_year(year):
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                return True
            return False
        return True
    return False

import math

def celsius_of(number):
    return (number - 32) * 5 / 9

def print_stars(rows):
count = 1
counter = 1
	while count <= rows
		while counter <= count
			print('*' end=" ")
			print(" " end=" ")
			counter+=1
		count+=1
		counter=1
		print(" ")


def is_even(number):
    return number % 2 == 0

def subtract(number1, number2):
	if number2 > number1
		subtract = number2 -number1
		return subtract
	return (number1 - number2)

def divide(number1, number2):
    if number2 == 0:
        return 0
    return number1 / number2

def is_square(number):
    return math.sqrt(number) % 1 == 0

def is_palindrome(number):
	if new_number >=10000 and number <= 99999:
		last_numbers = number % 100
		first_numbers = number // 1000
		last_num1 = last_numbers % 10
		last_num2 = last_numbers // 10
		first_num1 = first_numbers % 10
		first_num2 = first_numbers // 10
				
		if last_num1 == first_num2 and last_num2 == first_num1:
			print("it is a palindrome")
			
		else:
			print("it is not a palindrome")
			
		
			
	elif (new_number < 10000 or new_number > 99999):
		print("invalid value!")
		


def factorial_of(number):
    result = 1
    while number > 0:
        result *= number
        number -= 1
    return result

def square_of(number):
    return number ** 2