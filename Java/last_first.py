# Input  : {1, 2, 3, 4, 5, 6, 7}
# Output : {7, 1, 6, 2, 5, 3, 4}

arr = list(map(int, input("Enter numbers with space: ").split()))
n = len(arr)
for i, j in zip(range(n // 2), range(n - 1, n // 2 - 1, -1)):
    arr[i], arr[j] = arr[j], arr[i]
print(arr)



arr = list(map(int, input("Enter numbers with space: ").split()))
n = len(arr)

# Only rearrange first half
for i in range(n // 2):
    # Find the element from the end
    val = arr[n - 1 - i]
    
    # Shift elements to the right to make space at index 2*i
    for j in range(n - 1 - i, 2 * i, -1):
        arr[j] = arr[j - 1]
    
    arr[2 * i] = val

print(arr)