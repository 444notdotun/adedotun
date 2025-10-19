def get_length(word):
	count = 0
	for i in word:
		count+=1
	return count
		



print(get_length('adedotun'))



def get_reverse(letters):
	count = " "
	
	for letters_in_word in letters:
		count = letters_in_word+ count
	return(count)
	
print(get_reverse("adedotun"))



def get_seconds(minutes):
	seconds = minutes*60
	hours = minutes /60
	return f"{minutes} minutes in sec is { seconds} and in hour is { hours}" 


print(get_seconds(30))


def get_vowels(words):
	count_a = 0;
	count_e = 0;
	count_i = 0;
	count_o = 0;
	count_u = 0;
	count=0
	for i in words.lower():
		if i=="a":
			count_a+=1
			if count_a >1:
				count_a-=1
		if i=="e":
			count_e+=1
			if count_e >1:
				count_a-=1
		if i=="i":
			count_i+=1
			if count_i >1:
				count_i-=1
		if i=="o":
			count_o+=1
			if count_o >1:
				count_o-=1
		if i=="u":
			count_u+=1
			if count_u >1:
				count_u-=1
		
		 
			 
		
	count =count_a+count_e+count_i+count_o+count_u
	return count



print(get_vowels("PINEAPPLE"))