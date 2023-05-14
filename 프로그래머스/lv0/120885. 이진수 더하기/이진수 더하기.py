from collections import deque
def solution(bin1, bin2):
    answer = ''
    total = str(int(bin1) + int(bin2))

    d = deque(total)
    d.appendleft('0')
    for idx in range(len(d) - 1, -1, -1):
        if d[idx] == '2':
            d[idx] = str(int(d[idx]) - 2)
            d[idx - 1] = str(int(d[idx - 1]) + 1) 
        elif d[idx] == '3':
            d[idx] = str(int(d[idx]) - 2)
            d[idx - 1] = str(int(d[idx - 1]) + 1) 
        
    if d[0] == '0':
        d.popleft()
    
    return "".join(list(d))

