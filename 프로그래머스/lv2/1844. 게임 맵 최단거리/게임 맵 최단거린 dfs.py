def solution(maps):
    pf = [0, 0, 1, -1]
    ps = [1, -1, 0, 0]
    col_len = len(maps) - 1
    row_len = len(maps[0]) - 1
    
    def dfs(f, s, cnt):
        if maps[col_len][row_len] > 1 and cnt > maps[col_len][row_len]:
            return
        
        for df, ds in zip(pf, ps):  
            nf = f + df
            ns = s + ds
            if 0 <= nf <= col_len and 0 <= ns <= row_len and \
            ((maps[nf][ns] != 0 and maps[nf][ns] > cnt + 1) or maps[nf][ns] == 1):
                maps[nf][ns] = cnt + 1
                dfs(nf, ns, cnt + 1)
    
    dfs(0, 0, 1)
    if maps[col_len][row_len] == 0 or maps[col_len][row_len] == 1:
        return -1
    return maps[col_len][row_len]