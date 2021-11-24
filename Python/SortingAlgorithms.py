import math

#O(N^2)
def BubbleSort(arr):
    n = len(arr)
    for i in range (n):
        for j in range(n-i-1):
            if (arr[j] > arr[j+1]):
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

#O(N^2)
def SelectionSort(arr):
    n = len(arr)
    for i in range(n):
        minIndex = i
        for j in range(i+1, n):
            if (arr[j] < arr[minIndex]):
                minIndex = j
        arr[i], arr[minIndex] = arr[minIndex], arr[i]
    return arr

#O(N^2)
def InsertionSort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i-1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr

#O(Nlog^2(N))
def ShellSort(arr):
    n = len(arr)
    gap = n // 2

    while (gap > 0):
        i = 0
        j = gap

        while (j < n):
            if (arr[i] > arr[j]):
                arr[i], arr[j] = arr[j], arr[i]
            i += 1
            j += 1

            k = 1
            while ((k - gap) > -1):
                if arr[k - gap] > arr[k]:
                    arr[k-gap], arr[k] = arr[k], arr[k-gap]
                k -= 1
        gap //= 2
    
    return arr

#O(NlogN)
def MergeSort(arr):
    n = len(arr)
    if n > 1:
        middle = n // 2
        left = arr[:middle]
        right = arr[middle:]
        MergeSort(left)
        MergeSort(right)
        i = j = k = 0

        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                arr[k] = left[i]
                i += 1
            else:
                arr[k] = right[j]
                j += 1
            k += 1
 
        while i < len(left):
            arr[k] = left[i]
            i += 1
            k += 1
 
        while j < len(right):
            arr[k] = right[j]
            j += 1
            k += 1

    return arr

#O(N) only works for integers
def RadixSort(arr):
    n = len(arr)
    digits = math.log10(max(arr))
    digits = math.floor(digits)
    for i in range(1, digits):
        for j in range(n-1):
            if arr[j] % (10 ** i) > arr[j+1] % (10 ** i):
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr



arr = [34,7,19,4,92,52,33,29,75,28,49,48,68,95,61,76,8,4,76,92,40,73,86,7,14,22,18,36,19,50,41,68,50,1,72,87,30,57,77,9,13,48,71,6,62,77,57,100,84,40,59,24,85,11,50,71,47,90,72,46,6,38,49,92,87,58,33,91,46,14,90,58,98,72,94,91,9,45,94,42,68,43,66,71,4,54,33,33,17,28,36,86,35,86,41,62,91,15,41,88]
#print(BubbleSort(arr))
#print(SelectionSort(arr))
#print(InsertionSort(arr))
#print(ShellSort(arr))
print(RadixSort(arr))


