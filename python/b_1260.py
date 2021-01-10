from collections import deque

n, m, v = map(int, input().split())

graph = [[0] * (n + 1) for _ in range(n + 1)]
visit = [False] * (n + 1)

for _ in range(m):
    x, y = map(int, input().split())
    graph[x][y] = graph[y][x] = 1

# print(graph)

def dfs(x) :
    visit[x] = True
    print(x, end=' ')

    for i in range(n+1):
        if graph[x][i] == 1 and visit[i] == False:
            dfs(i)

def bfs(x):
    queue = deque()
    queue.append(x)
    visit[x] = True
    while queue:
        y = queue.popleft()
        print(y, end=' ')
        for i in range(n+1):
            if graph[y][i] == 1 and visit[i] == False:
                visit[i] = True
                queue.append(i)
            else:
                continue
        

dfs(v)
print()
visit = [False] * (n + 1)
bfs(v)
