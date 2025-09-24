
"""
declare a variable (count) and initialize a value of 0 to it
declare  variable(score) and initialize a value of 0 to it
use iteration condition that runs 3 times to ask user for score, save the score in a variable  and check if the score is;
 check if the score is more than or same as 90 and  if the score is smaller than or same to 100, and display grade of average is A and the average score  if not
check if the score is more than or same as 80 and  if the score is samller than  90, and display grade of average is B and the average score if not,
check if the score is Bigger than or same  to 70 and  if the score is smaller 80, and display grade of average is C and the average score  if not,
check if the score is bigger than  or same to 60 and  if the score is smaller than  70, and display grade of average is D and the average score if not,
display grade of average is F and the average score 
"""

 

count = 0
total = 0
while count < 3:
	score = int(input("enter score: "))
	total += score
	count+=1

	

total/=3

if total >= 90 and total <= 100:
	print("The average", total ,"and the grade is A")
elif total >= 80 and total <= 90:
	print("The average", total ,"and the grade is B")
elif total >= 70 and total <= 80:
	print("The average", total ,"and the grade is C")
elif total >= 60 and total <= 70:
	print("The average", total ,"and the grade is D")
else:
	print("The average", total ,"and the grade is F")



print(total)