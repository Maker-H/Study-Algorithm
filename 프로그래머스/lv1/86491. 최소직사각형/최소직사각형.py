def solution(sizes):
    max_a = sizes[0][0]
    max_b = sizes[0][1]
    
    for i in range(1, len(sizes)):
        a1, b1 = max_a, max_b
        a2, b2 = sizes[i]
        
        vanila = abs(a1 - a2) + abs(b1 - b2)
        reverse = abs(a1 - b2) + abs(b1 - a2)
        
        if vanila < reverse:
            max_a = max(a1, a2)
            max_b = max(b1, b2)
        else:
            max_a = max(a1, b2)
            max_b = max(a2, b1)
    
    return max_a * max_b
                
