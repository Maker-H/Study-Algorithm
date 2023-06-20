import heapq

def solution(operations):
    heap = []
    
    for word in operations:
        c, num = word.split(' ')
        if c == 'I':
            heapq.heappush(heap, int(num))
        elif len(heap) != 0:
            if c == 'D' and num == '1':
                heap.pop(heap.index(heapq.nlargest(1, heap)[0]))
            elif c == 'D' and num == '-1':
                heapq.heappop(heap)
        
    if len(heap) == 0:
        return [0, 0]
    else:
        high = heapq.nlargest(1, heap)[0]
        low = heapq.heappop(heap)
        return [high, low]
    
    
