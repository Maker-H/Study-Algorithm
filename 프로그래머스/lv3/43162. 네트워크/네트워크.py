cnt = 0
def dfs(graph, visited, v):
    global cnt
    
    if visited[v] == 1:
        return
    
    visited[v] = 1
    
    for w in graph[v]:
        if visited[w] == 0:
            dfs(graph, visited, w)


    
        
def solution(n, computers):
    graph = [[] * (n + 1) for _ in range(n + 1)]
    visited = [0] * (n + 1)
    
    for i in range(n):
        for j in range(n):
            if i == j:
                continue
            else:
                if (j + 1) not in graph[i + 1]:
                    if computers[i][j] == 1:
                        graph[i + 1] += [j + 1]
                        graph[j + 1] += [i + 1]
    
    global cnt
    for i in range(1, n + 1):
        if visited[i] == 0:
            cnt += 1
        dfs(graph, visited, i)
    
    return cnt
        