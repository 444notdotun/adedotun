prompt ="""
WELCOME TO NOKIA
LIST OF MENU FUNCTIONS
1-> Phonebook
2-> Messages
3-> Chat
4-> Call register
5-> Tones
6-> Settings
7-> Call divert
8-> Games
9-> Calculator
10-> Reminders
11-> Clock 
12-> Profiles
13-> Sim services 
				
ENTER A NUMBER: """
print(prompt)
menuinput = int(input())

match(menuinput):
	case 1:
		phonebook ="""
		PHONEBOOK
		1-> Search
		2-> Service Nos
		3-> Add name
		4-> Erase
		5-> Edit
		6-> Assign tone
		7-> send b'card
		8-> Options
		9-> Speed dials
		10-> Voice tags

		ENTER A NUMBER: """
		print(phonebook)
		phonebookinput = int(input())

		match phonebookinput:
			case 1: print("Search") 
			case 2: print("service nos")
			case 3: print("Add name")			
			case 4: print("Erase")
			case 5: print("Edit")
			case 6: print("Assign tone")
			case 7: print("send b'card")			
			case 8: 
				option ="""
				OPTIONS
				1-> Type of view
				2-> Memory status
				ENTER A NUMBER: """
				print(option)
				option_input = int(input())
				match option_input:
					case 1:print("Type of view")
					case 2:print("Memory status")
					case _: print("enter a valid number")

			case 9:print("Speed dials")
			case 10:print("Voice tags")
			case _: print("enter a valid number")

	case 2:
		messages="""
		MESSAGES
		1->Write messages
		2->inbox
		3->Outbox
		4->Picture messages
		5->Templates
		6->Smileys
		7->Messages settings
		8->info Service
		9->Voice mailbox number
		10->Service command editor 
		ENTER A NUMBER: """
		print(messages)
		messagesinput = int(input())

		match messagesinput:
			case 1:System.out.print("Write messages")
			case 2:System.out.print("inbox")
			case 3:System.out.print("outbox")		
			case 4:System.out.print("picture messages")
			case 5:System.out.print("templates")
			case 6:System.out.print("smileys")
			case 7:
				messages_settings ="""
				MESSAGES SETTINGS
				1-> Set
				2-> common
				ENTER A NUMBER:
	
				"""
				print(messagessettings)
				message_input = int(input.nextInt());
				match(messageinput):
					case 1:
						set = """
						SET
										
						1->Message centre number
						2->Message sent as
						3->Message validity
						ENTER A NUMBER:
						"""
						print(set)			
						setinput = int(input())
						match(setinput):
							case 1:print("Messages centre number")
							case 2:print("Messages sent as")
							case 3:print("Messages Validity")
							case _ :print("enter a valid number")
									
								
							
					case 2:
						common = """
						COMMMON	
						1->Delivery reports
						2->Reply via same centre
						3->Character support
						ENTER A NUMBER :
						"""
						print(common)
						commoninput =int( input())
						match(commoninput):
							case 1:print("Delivery reports")
							case 2:print("Reply via same centre")
							case 3:print("Character support")
							case _: print("enter a valid number")
			case 8:System.out.print("info service")
			case 9:System.out.print("Voice mailbox number")
			case 10:System.out.print("service command editor")
			case _ :System.out.print("enter a valid number")
						
					
					


	case 3:print("Chat")
	case 4:
		call ="""
		CALL REGISTER

		1-> missed calls
		2->Received calls
		3->Dialled numbers
		4->Erase recent call lists
		5->show call duration
		6-> show call cost
		7-> call cost settings
		8-> prepaid credit """
		print(call)
		callinput = int(input())
		match(callinput):
			case 1:print("Missed calls")
			case 2:Print("Rececieved calls")
			case 3:print("Dialled numbers")		
			case 4:print("Erase recent call lists")
			case 5:
				showcall = """
				SHOW CALL DURATION
				1:last call duration
				2:all call's duration
				3:Received calls duration
				4:Dialled calls duration
				5:call timers
				
				ENTER A NUMBER: 
				"""
				print(showcall)
				showcallinput = int(input())
				match(showcallinput):
					case 1:print("last call duration")
					case 2:print("all calls calls")
					case 3:print("Receievd calls numbers")
					case 4:print("Dialed call duration")
					case 5:print("Clear timers")
					case _ :print ("enter a valid number")
							
							
			case 6:
				callcost="""
				SHOW CALL COST
				1->last call cost
				2->all call's cost
				3->clear counters

				ENTER A NUMBER:
				"""
				print(callcost)
				callcostinput =int(input())
				match(callcostinput):
					case 1:print("last call cost")
					case 2:print("all calls cost")
					case 3:print("clear counters")
					case _ : print("enter a valid number")
			case 7:
				costsettings="""
				CALL COST SETTINGS
				1:call cost limit
				2:show costs in

				ENTER A NUMBER:	"""
				print(costsettings)
				costsettingsinput =int( input())
				match(costsettingsinput):
					case 1:print("call cost limit")
					case 2:print("show costs in")
					case _:print()
								
						
			case 8: print("Prepaid credit")
			case _:print("enter a valid number")
				
				

		
	case 5:
		tones ="""
		TONES
		1->Ringing tone
		2->Ringing volume
		3->incoming call alert
		4->composer
		5->Message alert tone
		6->Keypad tones
		7-> Warning and game tones
		8->Vibrating alert
		9->screen saver
					
		ENTER A NUMBER:	"""
		print(tones)
		tonesinput= int(input())
		match(tonesinput):
			case 1:print("Ringing tone")
			case 2:print("Ringing volume")
			case 3:print("incoming call alert")
			case 4:print("composer")
			case 5:print("Message alert tone")
			case 6:print("Keypad tones")
			case 7:print("Warning and game tones")
			case 8:print("Vibrating alert")
			case 9:print("screen saver")
			case _:print("enter a valid number")

					
	case 6:		
		settings = """
		SETTINGS
		1->Call ssettings
		2->security settings
		3->phone settings
		4->Restore factory settings
						
		ENTER A NUMBER: 
		"""
					

		print(settings)
		settingsinput=int( input())
		match(settingsinput):
			case 1:
				callsettings = """
				CALL SETTINGS
				1->Automatic redial
				2->Speed dialling
				3->Call waiting options
				4->Own number sending
				5->phone line in use
				6-> Automatic answer		


				ENTER A NUMBER:
				"""
				print(callsettings);
				call_input =int( input())
				match(call_input):
					case 1:print("Automatic redial")
					case 2:print("Speed dailling")
					case 3:print("Call waiting options")
					case 4:print("Own number sending")
					case 5:print("Phone line in use")
					case 6:print("Automatic answer")
					case _: print("enter a valid number")

								
							
			case 2:
				phone_settings = """
				PHONE SETTINGS
				1:language
				2:cell info display
				3:welcome note
				4:network selection
				5:lights
				6:confirm sim service actions
					
				ENTER A NUMBER:
				"""
				print(phone_settings)
				phone_input = int(input())
				match(phone_input):
					case 1:print("language")
					case 2:print("cell info display")
					case 3:print("welcome note")
					case 4:print("Network selection")
					case 5:print("lights")
					case 6:print("Confirm SIM service actions")
					case _:print("enter a valid number")
								
	
		
			case 3:
				Securitysettings = """
				PHONE SEETINGS
				1->PIN code request
				2->Call barring service
				3->Fixed dialling
				4->Closed user group
				5->phone security
				6->Change access code
							
				ENTER A NUMBER:
				""";

				print(Securitysettings)
				Securityinput = int(input())
				match(Securityinput):
					case 1:print("PIN code request")
					case 2:print("call barring service")
					case 3:print("Fixed dailling")
					case 4:print("Closed user group")
					case 5:print("phone security")
					case 6:print("Change access code")
					case _:print("enter a valid number");
								
	
								


							
			case 4:print("Restore factory settings")
			case _:print("enter a valid number");
						
				
	case 7:print("Call divert")
	case 8:print("Games")
	case 9:print("calculator")
	case 10:print("Reminders")
	case 11:
		clock = """
		CLOCK
		1->Alarm clock
		2->Clock settings
		3->Date settings
		4->Stopwatch
		5->Countdown timer
		6->Auto update of date and time
						

		ENTER A NUMBER:
		"""
		print(clock)
		clockinput = int(input())
		match(clockinput):
			case 1:print("Alarm clock")
			case 2:print("Clock settings")
			case 3:print("Date setting")
			case 4:print("Stopwatch")
			case 5:print("Countdown timer")
			case 6:print("Auto update of date and time")
			case _:System.out.print("enter a valid number")
	
							
	case 12:print("Profiles")
	case 13:print("Sim services")
	case _:print("enter a valid number")
							

					
					
				

			