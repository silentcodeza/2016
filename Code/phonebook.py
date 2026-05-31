########################
# FUNCTION DEFINITIONS #
########################

def number_string_to_int(num_string):
		# here we just need to remove all non-numeric characters:
		digits = "0123456789"
		final_num = ""
		for char in num_string:
				if char in digits:
						# in this case we append that digit to the string that will be the final number
						final_num += char
		return int(final_num)


def number_to_string(number):
		# the input is an integer.
		num_string = str(number) # a string, expectably of length 9
		# we build the number, adding the leading zero and the two spaces between the groups of digits
		output_string = "0" + num_string[0:2] + " " + num_string[2:5] + " " + num_string[5:9]
		return output_string


def add_phonebook_entry(name_string, number_string):
		global names, numbers # the two lists making the phonebook are global (toplevel) variables

		# first task is to convert the number string into a clean number (int)
		clean_number = number_string_to_int(number_string)

		# then we must check whether it corresponds to an existing entry in the phonebook:
		found = False
		for index in range(len(numbers)):
				if numbers[index] == clean_number:
						found = True
						break
		if found:
				print("Error: number already in the phonebook, associated with name " + names[index])
		else:
				names.append(name_string)
				numbers.append(clean_number)

		return None # no value to output here as a return value
				


def query_by_name(name_string):
		global names, numbers # the two lists making the phonebook are global (toplevel) variables

		for i in range(len(names)):	# scanning the names in the phonebook
				if names[i].lower() == name_string.lower():	# not to treat differently e.g. "Mary" and "mary"
						print(number_to_string(numbers[i]))
						return None

		# if we reach this point, the number has not been found
		print("Contact not found")
		return None



def print_book():
		global names, numbers # the two lists making the phonebook are global (toplevel) variables

		for i in range(len(names)):
				print(names[i], ":", number_to_string(numbers[i]))

		return None


def update_number(old, new):
		global numbers
		old_num_clean = number_string_to_int(old)

		found = False
		for i in range(len(numbers)):
				if numbers[i] == old_num_clean:
						found = True
						numbers[i] = number_string_to_int(new)
						break

		if not found:
				print("Warning! Was unable to update number, as old one was not present in the phonebook.")

		return None


def delete_num(num_to_delete):
		global names, numbers
		num_clean = number_string_to_int(num_to_delete)

		found = False
		for i in range(len(numbers)):
				if numbers[i] == num_clean:
						found = True
						if i == len(numbers) - 1:
								# the number to delete was in last position in the phonebook
								numbers.pop()	# simply discarding the last entry
								names.pop()		# simply discarding the last entry
						else:
								numbers[i] = numbers.pop()
								names[i] = names.pop()

		if not found:
				print("Warning! Was unable to delete this number, as it was not present in the phonebook.")

		return None




#########
# TESTS #
#########


# global variables:
# we start the phonebook with a few numbers in there
names = [ "Gadeeja", "Hloni", "Steve", "Abongile" ]
numbers = [ 841234567, 712546987, 862112231, 122652258 ]


while True:
		print("")	# to print a newline
		print("Please enter a command number:")
		print("p -> print phonebook contents")
		print("n -> add a new entry")
		print("u -> update an entry")
		print("s -> search for a name")
		print("d -> delete an entry")
		print("q -> exit this program")
		print("")	# to print a newline

		command = input()

		if command == "p":
				print_book()

		elif command == "n":
				name_to_add = input("Please enter the name of the new contact: ")
				num_to_add = input("Please enter " + name_to_add + "'s phone number: ")
				add_phonebook_entry(name_to_add, num_to_add)

		elif command == "u":
				old_num = input("Please enter the contact's old phone number: ")
				new_num = input("Please enter the new number for the same contact: ")
				update_number(old_num, new_num)


		elif command == "s":
				name_to_lookup = input("Please enter the name of the contact to query: ")
				query_by_name(name_to_lookup)

		elif command == "d":
				num_to_delete = input("Please enter the phone number to delete: ")
				delete_num(num_to_delete)

		elif command == "q":
				break

		else:
				print("Unrecognized command, try again!")


