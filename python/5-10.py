n, m = map(int,input().split(' '))

graph = []

dx = [1,-1,0,0]
dy = [0,0,1,-1]

result = 0

for i in range(n):
    graph.append(list(map(int,input())))

def validation(x,y):
    if x < 0 or x >= n or y < 0 or y >= m:
        return False
    return True

def dfs(x,y):
    if validation(x,y) == False:
        return False
    if graph[x][y] == 0:
        graph[x][y] = 1
        for i in range(4):
            dfs(x + dx[i], y + dy[i])
        return True
    return False
    

for i in range(n):
    for j in range(m):
        if dfs(i,j) == True:
            result += 1

dfs(0,0)

print(result)