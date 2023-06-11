from collections import Counter
def solution(n, results):
    graph = [[0] * (n + 1) for _ in range(n + 1)]
    
    for n1, n2 in results:
        graph[n1][n2] = 1
        graph[n2][n1] = -1
        
    for line in range(1, n + 1):
        for one in range(1, n + 1):
            
            if graph[line][one] == 1:
                for k in range(1, n + 1):
                    if graph[one][k] == 1:
                        graph[line][k] = 1
                        graph[k][line] = -1
            
            if graph[line][one] == -1:
                for k in range(1, n + 1):
                    if graph[one][k] == -1:
                        graph[line][k] = -1
                        graph[k][line] = 1

    answer = 0
    for line in range(1, n + 1):
        if Counter(graph[line])[0] == 2:
            answer += 1
    
    return answer