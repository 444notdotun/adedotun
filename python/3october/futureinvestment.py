def future_investment(amount,rate,years):
	month_of_investment = years*12

	solution = amount*(1+rate)**month_of_investment

	return solution	