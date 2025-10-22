def get_amount_per_pacel(pacel_input):
	if pacel_input < 50:
		output = pacel_input*160
		return output+5000
	elif pacel_input >= 50 and pacel_input <= 59:
		output = pacel_input*200
		return output+5000
	elif pacel_input >= 60 and pacel_input <= 69:
		output = pacel_input*250
		return output+5000
	else:
		output = pacel_input*500
		return output+5000
	