from password import *
latest =[0,0,0,0,0]
results=[]
numbers = input("enter your password: ")
results = seperator(numbers)
for count in range(len(results)):

    check_uppercase(count,latest,results)
    check_lower(count,latest,results)
    check_symbols(count,latest,results)
    check_number(count,latest,results)


check_length(latest,results)

counter = 0

for count in latest:
    if count == 1:
        counter+=1
if counter <1:
    print("enter password")
if counter >=1 and counter < 3:
    print("password is weak")
if counter >= 3 and counter <=4:
    print("password is medium")
if counter >= 5:
    print("password is strong")
