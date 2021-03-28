import sys

input = sys.stdin.readline

N = int(input())

INF = 9999999

dp = [INF] * (N + 1)

dp[N] = 0

for i in range(N,-1,-1):
  if i % 3 == 0:
    dp[i // 3] = min(dp[i] + 1, dp[i//3])
  if i % 2 == 0:
    dp[i // 2] = min(dp[i] + 1, dp[i//2])
  if i >= 1 :
    dp[i - 1] = min(dp[i] + 1, dp[i-1])

print(dp[1])