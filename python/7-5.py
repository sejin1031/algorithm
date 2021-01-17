n = int(input())

array = list(map(int,input().split(' ')))

m = int(input())

target_array = list(map(int,input().split(' ')))

def sol1():
    arr = [0] * 1000001
    maxNum = max(array)
    for i in array:
        arr[i] = 1
    for i in target_array:
        if arr[i] == 0:
            print('no', end=' ')
        else :
            print('yes', end=' ')

def sol2():
    array.sort()

    for i in target_array:
        result = binary_sesarch(array, i, 0, n-1)
        if result != None:
            print('yes', end=' ')
        else :
            print('no', end=' ')
    

def binary_sesarch(array,target,start,end):
    while start <= end:
        mid = (start + end) // 2
        if array[mid] == target:
            return mid
        elif array[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return None

sol2()