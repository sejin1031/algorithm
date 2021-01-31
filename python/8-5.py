n = int(input())

MAXINTEGER = 9999999

array = [MAXINTEGER] * (n + 1)

X = n

array[X] = 0

while n >= 2:
  if n % 5 == 0 :
    array[int(n/5)] = min(array[n] + 1,array[int(n/5)])
  if n % 3 == 0 :
    array[int(n/3)] = min(array[n] + 1,array[int(n/3)])
  if n % 2 == 0 :
    array[int(n/2)] = min(array[n] + 1,array[int(n/2)])
  array[n - 1] = min(array[n] + 1, array[n-1])
  print(n, array[n])
  n -= 1
print(array)

print(array[1])
