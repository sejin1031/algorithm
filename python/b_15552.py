import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input())

array = [list(map(int, input().split())) for _ in range(N)]

list(map((lambda x: print(str(x[0]+x[1])+'\n')), array))