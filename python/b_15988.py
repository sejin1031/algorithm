T = int(input())

dp = [0 for _ in range(1000001)]

dp[1] = 1
dp[2] = 2
dp[3] = 4

answer = [int(input()) for _ in range(T)]
  
for j in range(4,max(answer)+1):
  dp[j] = (dp[j-1] + dp[j-2] + dp[j-3]) % 1000000009
  
for i in range(T):
  print(dp[answer[i]])