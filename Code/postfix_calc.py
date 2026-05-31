class Calculator(object):
	operators = ['+','-','x','*','/']
	# This class implements a postfix (RPN) calculator using a stack and reading a string in (left to right)
	def __init__(self):
		self.stack = []

	def process_string(self,expression):
		# this function processes the given string.
		# that string contains a postfix expression, with items separated by spaces.
		l = len(expression)
		i = 0 # the index of where we are currently in the string

		while True: # we will exit this loop with a break statement

			# first we discard all the possible leading blanks
			while i < l and expression[i] == ' ':
				i += 1

			# now we have reached the first printable char of a new item, or the end of the string:
			if i == l:
				break
			else:
				begin = i

			# we then loop through the string until we are done with the current item:
			while i < l and expression[i] != ' ':
				i += 1

			# we are now ready to process this item. If it is an operator,
			# then we perform the corresponding calculation. The operands are the last two elements
			# in the stack. Otherwise it is a number, and then we put it on top of the stack.
			obj = expression[begin:i] # from index begin incl. to index i excl.
			if obj in Calculator.operators:
				if len(self.stack) < 2:
					print("Error: malformed stack, not enough operands!")
					return
				else:
					op2 = self.stack.pop() # beware of the order! operand2 then operand1!
					op1 = self.stack.pop()
					if obj == '+':
						self.stack.append(op1 + op2)
					elif obj == '-':
						self.stack.append(op1 - op2)
					elif obj == 'x' or obj == '*':
						self.stack.append(op1 * op2)
					else: # necessarily we have a division operator when we reach this point
						self.stack.append(op1 / op2)
			else:
				# the object in the string is not an operator, we assume it is a number
				# and we put it onto the stack, after a conversion string -> float
				self.stack.append(float(obj))

	def get_top_of_stack(self):
		# this function extracts (and deletes!) the top of the stack
		m = len(self.stack)
		if m==0:
			print("error:get_top_of_stack called on an empty stack!")
		else:
			if m>1:# refinement for question P8
				print("warning! unused intermediate results left in the stack!")
			return self.stack.pop()

	def show_top_of_stack(self):
		# this function produces the top of the stack, without altering the stack
		m = len(self.stack)
		if m==0:
			print("error:show_top_of_stack called on an empty stack!")
		else:
			if m>1:# refinement for question P8
				print("warning! unused intermediate results left in the stack!")
			return self.stack[m-1]


calc = Calculator()
calc.process_string("5 4 x")
print(calc.get_top_of_stack())
calc.process_string("4 5 6.4 + /")
print(calc.get_top_of_stack())
calc.process_string("4 5 6 4 3 + + +")
print(calc.get_top_of_stack())
