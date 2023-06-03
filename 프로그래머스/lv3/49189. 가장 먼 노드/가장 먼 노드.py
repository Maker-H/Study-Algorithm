from collections import deque, Counter
def solution(n, edge):
    global graph
    global visited
    graph = [[] for _ in range(n + 1)]
    visited = [0 for _ in range(n + 1)]     
    
    for n1, n2 in edge:
        graph[n2] += [n1]    
        graph[n1] += [n2]
        
    bfs()
    cnt = Counter(visited)
    return cnt[max(visited)]
    
def bfs():
    visited[1] = 1
    
    D = deque([1])
    
    while D:
        node = D.popleft()
        
        for child in graph[node]:
            if visited[child] == 0:
                visited[child] = visited[node] + 1
                D.append(child)
                