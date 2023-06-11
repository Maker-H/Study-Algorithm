import heapq
def solution(scoville, K):
    heapq.heapify(scoville)
    count = 0
    
    
    while scoville[0] < K:
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        heapq.heappush(scoville, first + second * 2)
        count += 1
    
        if len(scoville) == 1 and scoville[0] < K:
            return -1
    
        
    return count