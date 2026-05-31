def partial_sums(l):
		sum_even = 0
		sum_odd = 0
		for i in range(len(l)):
				if i % 2 == 0:
						sum_even += l[i]
				else:
						sum_odd += l[i]
		print("Sum of the elements at even indices:", sum_even)
		print("Sum of the elements at odd indices:", sum_odd)

# test case
partial_sums([1,-2,7.89,3.4,2])
