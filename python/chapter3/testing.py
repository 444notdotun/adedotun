"""
a = b = 7
print('a =', a, '\nb =', b)

for row in range(10):
	for column in range(10):
 		print('<' if row % 2 == 1 else '\n>', end='')
print()
"""

for row in range(2):
	for replace in range(7):
		print('@' ,end='')
	print('hi')