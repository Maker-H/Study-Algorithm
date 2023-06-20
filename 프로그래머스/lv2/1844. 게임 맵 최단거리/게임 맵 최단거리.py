from collections import deque

def solution(maps):
    answer = 0
    row_len = len(maps[0]) - 1
    col_len = len(maps) - 1
    visited = [[0] * (row_len + 1) for _ in range(col_len + 1)]
    
    return bfs(col_len, row_len, visited, maps)


def bfs(end_f, end_s, visited, maps):
    D = deque()
    ans = -1
    D.append([0, 0, 1])
    visited[0][0] = 1
    
    while D:
        f, s, cnt = D.popleft()
            
        if f == end_f and s == end_s:
            ans = cnt
            break

        for df, ds in [[0, 1], [0, -1], [1, 0], [-1, 0]]:
            nf = f + df
            ns = s + ds
                
            if 0 <= nf <= end_f and 0 <= ns <= end_s:
                if maps[nf][ns] == 1 and visited[nf][ns] == 0:
                    visited[nf][ns] = 1
                    D.append([nf, ns, cnt + 1])
    
    if ans == -1:
        return -1
    else:
        return ans