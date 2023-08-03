def solution(m, n, puddles):
    mini_map = [[0] * (m + 1) for _ in range(n + 1)]
    mini_map[1][1] = 1
    
        
    for f in range(0, n + 1):
        for s in range(0, m + 1):
            if f == 1 and s == 1:
                continue
            if [s, f] not in puddles:
                mini_map[f][s] = mini_map[f][s - 1] + mini_map[f - 1][s]
    
    return mini_map[n][m] % 1000000007

