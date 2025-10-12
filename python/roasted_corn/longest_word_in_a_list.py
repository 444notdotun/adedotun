def longest_word_in_a_list(word):
	longest = len(word[0])
	longest_name = word[0]
	for count in range (1,len(word)):
		if len(word[count]) > longest:
			longest = len(word[count])
			longest_name = word[count]

	return f"longest word {longest_name}, total number of {longest}"

print(longest_word_in_a_list(["welcome","out", "weather", "breakfast", "journey"]))