Q = [3, 4, 1, 3, 4, 5]
def find_min(L):
    return L.index(min(L))

def swap(L,i,j):
    temp = L[i]
    L[i] = L[j]
    L[j] = temp

def selection_sort(L):
    for i in range(len(L)):
        minimum = i + find_min(L[i:])
        swap(L, i, minimum)
        
def sort(L):
    return L.sort()

