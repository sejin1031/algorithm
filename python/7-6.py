n, m = map(int,input().split(' '))

array = list(map(int,input().split(' ')))

array.sort()

maxNum = max(array) - 1

def checkIsOk(cutSize):
    result = 0
    for i in array:
        if i > cutSize:
            result += (i - cutSize)
    if result >= m:
        return True
    else:
        return False

def binary_search(start,end):
    mid = 0
    while start <= end:
        mid = (start + end ) // 2
        if checkIsOk(mid) == True:
            start = mid + 1
        else:
            end = mid - 1
    
    print(mid)

binary_search(1,maxNum)
