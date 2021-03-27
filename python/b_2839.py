N = int(input())

INF = 9999999

array = [INF] * (N+1)

array[N-3] = 1

if N >= 5:
  array[N-5] = 1


for i in range(N+1):
  j = N - i  
  if j - 3 >= 0:
    array[j-5] = min(array[j-5],array[j] + 1)
    array[j-3] = min(array[j-3],array[j] + 1)

if array[0] == INF:
  array[0] = -1

print(array[0])