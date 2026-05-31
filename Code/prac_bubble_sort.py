
## PREMILINARY QUESTION ##

def swap(mylist,i):
	# this function doesnt _return_ anything but it swaps the two elements in the list mylist
	# that sit at indices i and (i+1).
	if (i >= 0 and i+1 <= len(mylist) - 1): # testing that the two indices are valid for the list
		temp = mylist[i+1]
		mylist[i+1] = mylist[i]
		mylist[i] = temp
	else:
		print('error: index out of bounds')


## QUESTION 1 ##

def scan_once(l):
	# this function performs one full scan of the list, swapping consecutive elements that would be in incorrect order.
	# it returns True if it has performed at least one swap, False otherwise (meaning that the input list was sorted)
	at_least_one_swap = False
	length = len(l)
	for i in range(length - 1): # we perform at most (length - 1) swaps, e.g. 3 swaps in a list of 4 elements
		if l[i] > l[i+1]: # we do not perform a swap in case of equality: that would be totally useless
			swap(l,i)
			at_least_one_swap = True
	return at_least_one_swap # to let the caller know whether the input list was already sorted


## QUESTION 2 with refinement of QUESTION 3 ##

def bubble_sort(l):
	# this function performs the bubble sort algorithm. It alters the list object that is given as parameter.
	do_i_have_to_continue = True
	while (do_i_have_to_continue):
		do_i_have_to_continue = scan_once(l)
	return l

## QUESTION 4 ##

def bubble_sort(l):
	# this function performs the bubble sort algorithm. It does not alter the list object that is given as parameter.
	localcopy = l[:] # this creates a list called localcopy that is a copy of the list l. l is unchanged by this bubble_sort.
	do_i_have_to_continue = True
	while (do_i_have_to_continue):
		do_i_have_to_continue = scan_once(localcopy)
	return localcopy




## BINARY SEARCH ##

def binary_search(value, mylist):
	# this function performs a binary search, looking for value in mylist.
	# in case the search is successful, the function returns the index where the element is, otherwise it returns -1.
	length = len(mylist)
	if length == 0:
		return -1
	else: # the list has at least one element
		first = 0
		last = length-1
		# and length is the length of the current chunk (already set)

		while length > 1:
			midpoint = int((first+last)/2) # this is the floor of the average, e.g. int(3.5) == 3
			if mylist[midpoint] == value:
				return midpoint # we have found the value sought
			elif mylist[midpoint] < value:
				# if present, the value is in the second half of the list
				first = midpoint + 1 # we don't modify last, the last possible position
			else: # if present, the value is in the first half of the list
				last = midpoint - 1 # we don't modify first, the first possible position
			length = last - first + 1 # importantly, this is OUTSIDE the if/elif/else, so computed in all cases

		# when the execution reaches this point, l == 1 (which means last == first) and we have to test whether the element is there:
		if mylist[first] == value:
			return first
		else:
			return -1


# Well, the function above is beautiful, BUT it doesn't necessarily return the very first element being equal to the searched value.
# We are going to modify it slightly by using an ancillary function that takes as input a sorted list and an index k, and returns the first
# index (which is index k or some index < k) where we see the same element as at index k.
# For instance, get_first_index([1,1,1,2,3,3,3,3,3,3],7) will return 4, because the value at index 7 is 3 and that value appears first at index 4.

def get_first_index(mylist, k):
	if k < 0 or k >= len(mylist):
		print("error in get_first_index: index out of bounds.")
		return -1 # kind of an error code
	else:
		elem = mylist[k] # the element for which we are going to find the first occurrence
		# k is readily a local variable. We are going to decrement it as long as the currrent element in the list remains equal to elem.
		while k > 0: # which means there exists a mylist[k-1] element
			if mylist[k-1] == elem:
				k -= 1
			else:
				break
		return k # either because k == 0 or because the break instruction has been reached

# and then we can rewrite the return statements of our bubble sort function above, to return the return value of get_first_index(mylist,k)
# instead of k itself, which gives:

def binary_search(value, mylist):
	# this function performs a binary search, looking for value in mylist.
	# in case the search is successful, the function returns the FIRST index where the element is, otherwise it returns -1.
	length = len(mylist)
	if length == 0:
		return -1
	else: # the list has at least one element
		first = 0
		last = length-1
		# and length is the length of the current chunk (already set)

		while length > 1:
			midpoint = int((first+last)/2) # this is the floor of the average, e.g. int(3.5) == 3
			if mylist[midpoint] == value:
				return get_first_index(mylist,midpoint) # we have found the value sought
			elif mylist[midpoint] < value:
				# if present, the value is in the second half of the list
				first = midpoint + 1 # we don't modify last, the last possible position
			else: # if present, the value is in the first half of the list
				last = midpoint - 1 # we don't modify first, the first possible position
			length = last - first + 1 # importantly, this is OUTSIDE the if/elif/else, so computed in all cases

		# when the execution reaches this point, l == 1 (which means last == first) and we have to test whether the element is there:
		if mylist[first] == value:
			return get_first_index(mylist,first)
		else:
			return -1




## EXAMPLE FUNCTION CALLS ##


list1 = [4,5,443,-12.4,5,2,0,-435,23,11,-3,2,2,2,2,2,2]
print(list1)
sorted = bubble_sort(list1)
print(sorted)
print(list1) # to see whether it has been modified
print("Searching for 2: index", binary_search(2,sorted))
print("Searching for 100: index", binary_search(-1,sorted))


