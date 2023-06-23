def solution(tickets):
    tick = {}
    for start, end in tickets:
        if start not in tick:
            tick[start] = [end]
        else:
            tick[start].append(end)
    
    # 정렬
    for n in tick:
        tick[n].sort(reverse=True)
        
    answer = []
    def dfs():
        stack = ["ICN"]

        while stack:

            tmp = stack[-1]
            
            if (tmp not in tick) or (not tick[tmp]):
                answer.append(stack.pop())
            else:
                stack.append(tick[tmp].pop())     
                
    dfs()
    return answer[::-1]
        
