from collections import deque
def solution(n, wires):
    graph = [[] for i in range(n + 1)]
    
    for n1, n2 in wires:
        graph[n1] += [n2]
        graph[n2] += [n1]
    
    def bfs(start):
        visited = [0] * (n + 1)
        D = deque()
        D.append(start)
        visited[start] = 1
        # print('start', start)
        
        cnt = 0
        while D:
            # print('D', D)
            node = D.popleft()
            
            for w in graph[node]:
                if visited[w] == 0:
                    cnt += 1
                    D.append(w)
                    visited[w] = 1
        
        print('cnt', cnt)
        return cnt
    
    tmp = 100
    for a, b in wires:
        graph[a].remove(b)
        graph[b].remove(a)
        
        tmp = min(abs(bfs(a) - bfs(b)), tmp)
        # print(graph)
        
        graph[a].append(b)
        graph[b].append(a)

    return tmp
        
                