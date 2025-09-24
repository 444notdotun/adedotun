
#declare  variable (count) and initialize a value of 3 to it
#declare  variable(sum) and initialize a value of 0 to it
#use iteration condition that runs 3 times to ask user for score, save the score in a variable  #and check if the score is;
#1. greater than or equals to 0 and lesser than equals to 100, if not
#enter a valid input, but if it is right , the addition of sum and count should be saved in #variable total, then;
#check if the score is greater than or equals to 90 and  if the score is les than or equals to #100, and display "the score  and the grade is A" if not
#check if the score is greater than or equals to 80 and  if the score is less than  90, and #display "the score  and the grade is B" if not,
#check if the score is greater than or equals to 70 and  if the score is less than  80, and #display "the score  and the grade is C", if not,
#check if the score is greater than or equals to 60 and  if the score is less than  70, and #display "the score  and the grade is D"if not,
#display "the score and the grade is F"
#when the condition exceeds 3 iteration, the cycle ends
#reinitialize count to be 3 then display the result of sum divided by count.

count = 3
total = 0
while count > 0:
	score = int(input("enter score: "))
	if score >= 0 and score <= 100:
		total += score
		if score >= 90 and score <= 100:
			print("The score", score ,"and the grade is A")
		elif score >= 80 and score <= 90:
			print("The score", score ,"and the grade is B")
		elif score >= 70 and score <= 80:
			print("The score", score ,"and the grade is C")
		elif score >= 60 and score <= 70:
			print("The score", score ,"and the grade is B")
		else:
			print("The score", score ,"and the grade is F")





	else:
		print("invalid input")

	count-=1
count = 3
print(total / count)