choice = input("Choose an option (1-5): ")	

try :

	taxable_income = float(input("Enter your taxable income: "))

	if choice == '1':

		print ("Your tax is calculated as a Single filer")
		if taxable_income >= 0 and taxable_income <= 8350:
			tax = taxable_income * 0.1
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 8350 and taxable_income <= 33950:
			tax = 8350 * 0.1 + (taxable_income - 8350) * 0.15
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 33950 and taxable_income <= 82250:
			tax = 8350 * 0.1 + (33950-8350) * 0.15 + (taxable_income - 33950) * 0.25
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 82250 and taxable_income <= 171550:
			tax = 8350 * 0.1 + (33950-8350) * 0.15 + (82250-33950) * 0.25 + (taxable_income - 82250) * 0.28
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 171550 and taxable_income <= 372950:
			tax = 8350 * 0.1 + (33950-8350) * 0.15 + (82250-33950) * 0.25 + (171550-82250) * 0.28 + (taxable_income - 171550) * 0.33
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 372950 :
			tax = (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxable_income - 372950) * 0.35
			print (f"The payable tax is {tax:.2f}")
		else:
			print("Invalid amount entered.")  

	elif choice == '2':
		print ("Your tax is calculated as Married Filing Jointly")
		if taxable_income >= 0 and taxable_income <= 16700:
			tax = taxable_income * 0.1
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 16700 and taxable_income <= 67900:
			tax = 16700 * 0.1 + (taxable_income - 16700) * 0.15
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 67900 and taxable_income <= 137050:
			tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (taxable_income - 67900) * 0.25
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 137050 and taxable_income <= 208850:
			tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxable_income - 137050) * 0.28
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 208850 and taxable_income <= 372950:
			tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (taxable_income - 208850) * 0.33
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 372950 :
			tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (taxable_income - 372950) * 0.35
			print (f"The payable tax is {tax:.2f}")
		else:
			print("Invalid amount entered.")  

	elif choice == '3': 
		print ("Your tax is calculated as Married Filing Seperately")
		if taxable_income >= 0 and taxable_income <= 8350:
			tax = taxable_income * 0.1
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 8350 and taxable_income <= 33950:
			tax = 8350 * 0.1 + (taxable_income - 8350) * 0.15
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 33950 and taxable_income <= 68525:
			tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (taxable_income - 33950) * 0.25
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 68525 and taxable_income <= 104425:
			tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxable_income - 68525) * 0.28
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 104425 and taxable_income <= 186475:
			tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (taxable_income - 104425) * 0.33
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 186475 :
			tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (taxable_income - 186475) * 0.35
			print (f"The payable tax is {tax:.2f}")
		else:
			print("Invalid amount entered.")

	elif choice == '4':  
		print ("Your tax is calculated as Head of Household")
		if taxable_income >= 0 and taxable_income <= 11950:
			tax = taxable_income * 0.1
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 11950 and taxable_income <= 45500:
			tax = 11950 * 0.1 + (taxable_income - 11950) * 0.15
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 45500 and taxable_income <= 117450:
			tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (taxable_income - 45500) * 0.25
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 117450 and taxable_income <= 190200:
			tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxable_income - 117450) * 0.28
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 190200 and taxable_income <= 372950:
			tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (taxable_income - 190200) * 0.33
			print (f"The payable tax is {tax:.2f}")

		elif taxable_income > 372950 :
			tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (taxable_income - 372950) * 0.35
			print (f"The payable tax is {tax:.2f}")
		else:
			print("Invalid amount entered.")

	else:
       		print("Tax option not available. Please try again.")

except ValueError:
	print("Invalid input. Please enter a numeric value for taxable income.")