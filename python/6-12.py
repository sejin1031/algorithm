n, k = map(int, input().split())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort()

result = 0

for i in range(n):
    if i < k and a[i] < b[n-i-1]:
        a[i] = b[n-i-1]

print(sum(a))