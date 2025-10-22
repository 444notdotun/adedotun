from function_of_fuel_dispenser_system import *
transaction=[]
while(True):
	print(dispenser_main_menu())
	main_menu_input = input("Enter operation: ")
	match main_menu_input:
		case "1":
			while(True):
				print(buy_menu())
				buy_menu_input = input("Enter operation: ")
				match buy_menu_input:
					case "1":
						while(True):
							decider_input=input("liter or amount:  ").lower()
							match decider_input:
							
								case "amount":
									
									buy_petrol_input =input("How much petrol are you buying(650/L: ")
									if buy_petrol_input.isdigit():
										
										buy_petrol_input = int(buy_petrol_input)
										print(buy_petrol_in_amount(buy_petrol_input,transaction))
										print("saving transaction History")
										break

									else:
										print("enter a valid input")
										

								case "liter":
									
									buy_petrol_liters = input("how many liters are you buying: ")
									if buy_petrol_liters.isdigit():
										buy_petrol_liters = float(buy_petrol_liters)
										print(buy_petrol_in_liters(buy_petrol_liters,transaction))
										if buy_petrol_liters >=1  and buy_petrol_liters <= 50:
											print("saving transaction History.......................")
										break
									else:
										print("enter a valid input")
								case _:
									output ="""
=====================
Enter a valid input
========================
										"""
									print(output)
					case "2":
						while(True):
							decider_diesel_input=input("liter or amount: ").lower()
							match decider_diesel_input:
								
								case "amount":
									
									buy_diesel_amount = input("How much diesel are you buying(720/L): ")
									if buy_diesel_amount.isdigit():
										buy_diesel_amount = int(buy_diesel_amount)
										print(buy_diesel_in_amount(buy_diesel_amount,transaction))
										print("saving transaction History")
										break
									else:
										print("enter a valid input")
								case "liter":
									
									buy_diesel_amount = input("How much liters of diesel are you buying(720/L): ")
									if buy_diesel_amount.isdigit():
										buy_diesel_amount = int(buy_diesel_amount)
										print(buy_diesel_in_liters(buy_diesel_amount,transaction))
										if buy_diesel_amount >=1 and buy_diesel_amount < 51:
											print("saving transaction History...............")
										break
									else:
										print("enter an input")
								case _:
									output ="""
=====================
Enter a valid input
========================
										"""
									print(output)
					case "3":
						while(True):
							decider_kerosene_input=input("liter or amount: ").lower()
							match decider_kerosene_input:
								case "amount":
									buy_kerosene_amount = float(input("How much kerosene are you buying(550/L): "))
									
										
									if buy_kerosene_amount.isdigit():
										buy_kerosene_amount = int(buy_kerosene_amount)
										print(buy_kerosense_in_amount(buy_kerosene_amount,transaction))
										print("saving transaction History")
										break
									else:
										print("enter a valid")
								case "liter":
									buy_kerosene_liter =float( input("How much liters of kerosene are you buying(550/L): "))
									

										
									if buy_kerosene_liter.isdigit():
										buy_kerosene_liter = int(buy_kerosene_liter)
										print(buy_kerosense_in_liters(buy_kerosene_liter,transaction))
										if buy_kerosene_liter >=1 and buy_kerosene_liter < 51:
											print("saving transaction History.........")
										break
									else:
										print("enter a valid number")
								case _:
									output ="""
=====================
Enter a valid input
========================
										"""
									print(output)
					case "4":
						while(True):
							decider_gas_input=input("KG or amount: ").lower()
							match decider_gas_input:
								case "amount":
									buy_gas_amount = float(input("How much gas are you buying(480/KG): "))
									
									
									if buy_gas_amount.isdigit():
										buy_gas_amount = int(buy_gas_amount)
										print(buy_gas_in_amount(buy_gas_amount,transaction))
										print("saving transaction History")
										break
									else:
										print("enter a number")
								case "kg":
									buy_gas_liter =float(input("How much KG of gas are you buying(480/KG): "))
									
									if buy_gas_liter.isdigit():
										buy_gas_liter = int(buy_gas_liter)
										print(buy_gas_in_liters(buy_gas_liter,transaction))
										if buy_gas_liter >=1 and buy_gas_liter < 51:
											print("saving transaction History.........")
										break
									else:
										print("enter a number")
									
								case _:
									output ="""
=====================
Enter a valid input
========================
										"""
									print(output)
					case "5":
						break
					case _:
						print("enter a valid input")
		case "2":	
			show_transaction_history(transaction)
		case "3":
			print("THANK YOU FOR PETRONIZING WITH US")
			break				
		case _:
			print("ENTER A VALID INPUT!")