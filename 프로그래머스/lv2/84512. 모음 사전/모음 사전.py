from collections import deque
def solution(word):
    dic = ['A', 'E', 'I', 'O', 'U']
    answer = 0
    per = []
    
    def dfs(node):
        per.append(node)
        
        if len(node) == len(dic):
            return
        
        for i in dic:
            dfs(node + i)
    
    for c in dic:
        dfs(c)
    # print(per)
    
    return per.index(word) + 1
        