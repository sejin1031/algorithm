N = int(input())

array = [0] * 1001

array[1] = 1
array[2] = 3

for i in range(3,N+1):
  array[i] = (array[i-1] + 2 * array[i-2]) % 796796

print(array[N])