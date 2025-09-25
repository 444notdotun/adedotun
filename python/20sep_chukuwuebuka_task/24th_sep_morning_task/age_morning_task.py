"""


ask user for two input and save one as father's age and the other as sons age ranging from 1-80
check if the user input are greater than 1 and lesser than 80
initialize tempsonage to be  2 multiply by sons age 
initialize total to 0
check if tempsonage is more than or equals to the fathers age, if yes, subtract father'sage from tempsonsage  and save in total, display the father age was twice as old as his son in total years, if not
check if tempson'sage is lesser than the fathers age, if yes, subtract tempson'sage from father'sage and save in total, display the father age was will be twice as the sons age in total years.*/
"""




fatherage = int(input("enter father'sage: "))
sonsage = int(input("enter son'sage: "))
tempsonage = 2 * sonsage
total = 0

if tempsonage >= fatherage:
	total = fatherage - tempsonage
	print("The father age was twice as old as his son in", total, " years")


if tempsonage < fatherage:
	total = abs( tempsonage - fatherage)
	print("The father age was will be twice as the sons age in", total, " years")


