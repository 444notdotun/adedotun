p = int(input("enter amount invested: "))
n = int(input("enter number of years: "))
R = 0.07

a =p * ( 1 + R) ** n

print("return after", n, "years is", a)