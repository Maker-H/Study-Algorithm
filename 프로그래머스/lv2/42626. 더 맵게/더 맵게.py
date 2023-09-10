import heapq
def solution(scoville, K):
    ls = []
    for s in scoville:
        heapq.heappush(ls, s)
        
    tmp = 0
    cnt = 0
    while ls[0] < K:
        if len(ls) == 1 and ls[0] < K:
            return -1
        s1 = heapq.heappop(ls)
        s2 = heapq.heappop(ls)
        
        tmp = s1 + (s2 * 2)
        
        # print(s1, s2)
        
        heapq.heappush(ls, tmp)
    
        cnt += 1
        
        # print(ls)
        
        # print(cnt)
    
    return cnt
        
        