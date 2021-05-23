def swap(arr, a, b):
	temp = arr[a]
	arr[a] = arr[b]
	arr[b] = temp


def min(arr, offset):
	m = offset
	for i in range(offset, len(arr)):
		if arr[i] < arr[m]:
			m = i

	return m


def sort(arr):
	for i in range(0, len(arr)):
		m = min(arr, i)
		swap(arr, i, m)


numbers = [2, 6, 7, 1, 2, 3, 4, 5]
print(numbers)
sort(numbers)
print(numbers)