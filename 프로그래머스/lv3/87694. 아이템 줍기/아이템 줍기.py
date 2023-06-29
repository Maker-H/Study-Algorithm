from collections import deque

def solution(rectangle, characterX, characterY, itemX, itemY):
    answer = 0
    maxX = 0
    maxY = 0
    
    for lb_x, lb_y, rt_x, rt_y  in rectangle:
        maxX = max((rt_x * 2), maxX)
        maxY = max((rt_y * 2), maxY)
    # print(maxX, maxY)
    
    graph = [[0] * (maxX + 10) for _ in range(maxY + 10)]
    visited = [[0] * (maxX + 10) for _ in range(maxY + 10)]
    
    for lb_x, lb_y, rt_x, rt_y  in rectangle:
        for f in range((lb_y * 2), (rt_y * 2) + 1):
            for s in range((lb_x * 2), (rt_x * 2) + 1):
                graph[f][s] = 1
    
    for f in range(maxY + 1):
        for s in range(maxX + 1):
            if graph[f][s] == 1:
                for df, ds in [[1, 0], [-1, 0], [0, 1], [0, -1], [1, 1], [-1, -1], [1, -1], [-1, 1]]:
                    nf = f + df 
                    ns = s + ds
                    if 0 <= nf <= (maxY + 1) and 0 <= ns <= (maxX + 1)and (graph[nf][ns] == 0):
                        graph[f][s] = 2
                        break
                        
    # for i in range(maxY + 3):
    #     for j in range(maxX + 3):
    #         print(graph[i][j], end='')
    #     print()
            
    def bfs():
        D = deque()
        visited[characterY * 2][characterX * 2] = 1
        D.append([characterY * 2, characterX * 2, 0])
        
        while D:
            f, s, cnt = D.popleft()
            
            if (f, s) == (itemY * 2, itemX * 2):
                return cnt
            
            for df, ds in [[1, 0], [-1, 0], [0, 1], [0, -1]]:
                nf = f + df 
                ns = s + ds
                if 0 <= nf <= maxY and 0 <= ns <= maxX and graph[nf][ns] == 2 and visited[nf][ns] == 0:
                    visited[nf][ns] = 1
                    D.append([nf, ns, cnt + 1])
                    
    answer = bfs()
    return answer // 2