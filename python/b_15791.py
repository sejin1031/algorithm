n, m = map(int,input().split(' '))

def C(n,k) :
  if k > n:
    return 0
  if k == 0 or k == n:
    return 1
  
  return C(n-1,k-1) + C(n-1,k)

print(C(n,m) % 1000000007)