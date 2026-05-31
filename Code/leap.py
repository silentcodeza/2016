for year in range(2000,3001): # because we want to include year 3000
	if year % 4 == 0:
		if year % 100 == 0:
			if year % 400 == 0:
				print(year) # e.g 2000
			# else we don't print (the "else" is not necessary)
		else:
			print(year) # divisible by 4 but not by 100
	# else we don't print (year not divisible by 400)

