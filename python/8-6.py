n = int(input())

array = list(map(int,input().split(' ')))

result = [0] * n

result[0] = array[0]
result[1] = array[1]

for i in range(3,n):
  result[i] = max(result[i-2] + array[i], result[i-1])

print(result[n-1])