def deriv(poly):
		result = []
		for n in range(1,len(poly)):# omitting power 0
				# we are differentiating poly[n] * x^n
				result.append(n * poly[n])
		return result

def eval0(poly,x):
		# VERY straightforward implementation
		value = 0
		for i in range(len(poly)):
				value += poly[i] * x**i
		return value


def eval1(poly,x):
		# straightforward evaluation of poly(x), more efficient
		value = poly[0] # constant term
		power_x = x
		for i in range(1,len(poly)):
				value += poly[i] * power_x
				power_x *= x # power_x stores x^i
		return value


def eval2(poly,x):
		# Hörner-like evaluation, most efficient
		value = 0
		for i in range(len(poly)-1,-1,-1):
				value = value * x + poly[i]
		return value



def trend(poly, value):
		value_derivative = eval2(deriv(poly),value)
		if value_derivative < 0:
				print("decreasing")
		elif value_derivative == 0:
				print("local extremum")
		else:
				print("increasing")



mypol = [3,4.5,-6,0,0,1]
val = 45.353
print(deriv(mypol))
print(eval0(mypol,val))
print(eval1(mypol,val))
print(eval2(mypol,val))

trend(mypol,val)
mypol=[3,2,1]
trend(mypol,-1000)
