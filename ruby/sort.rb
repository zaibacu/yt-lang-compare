def min(arr, offset)
	m = offset
	for i in offset..arr.length - 1
		if arr[i] < arr[m] then
			m = i
		end
	end

	return m
end

def swap(arr, a, b)
	temp = arr[a]
	arr[a] = arr[b]
	arr[b] = temp
end

def sort(arr)
	for i in 0..arr.length - 1
		m = min(arr, i)
		swap(arr, i, m)
	end
end

numbers = [2, 6, 7, 1, 2, 3, 4, 5]
print(numbers)
sort(numbers)
print(numbers)