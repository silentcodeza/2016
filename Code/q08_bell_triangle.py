def bell(i,j):
		if i == 0 and j == 0:
				return 1
		elif j == 0 and i > 0:
				return bell(i-1,i-1)
		elif i > 0 and j <= i:
				return bell(i-1,j-1) + bell(i, j-1)
		else:
				return 0


print(bell(10,7))
print(bell(-1,-1))
print(bell(4,7))
