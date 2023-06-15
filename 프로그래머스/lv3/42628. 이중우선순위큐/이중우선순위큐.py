import heapq

def change_heap(heap):
    tmp = []
    for i in heap:
        heapq.heappush(tmp, -i)
    return tmp


def solution(operations):
    max_heap = []
    min_heap = []
    
    for word in operations:
        c, num = word.split(' ')
        if c == 'I':
            heapq.heappush(max_heap, -int(num))
            heapq.heappush(min_heap, int(num))
        elif len(max_heap) != 0:
            if c == 'D' and num == '1':
                heapq.heappop(max_heap)
                min_heap = change_heap(max_heap)
            elif c == 'D' and num == '-1':
                heapq.heappop(min_heap)
                max_heap = change_heap(min_heap)
        
    if len(max_heap) == 0:
        return [0, 0]
    else:
        high = heapq.heappop(max_heap)
        low = heapq.heappop(min_heap)
        return [-high, low]
    
    
