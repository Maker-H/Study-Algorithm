from collections import deque

def bfs(numbers, target):
    D = deque()
    D.append([0, -1])
    num_len = len(numbers)
    ans = 0
    
    while D:
        total, idx = D.popleft()
        idx += 1
        
        if idx < num_len:
            D.append([total + numbers[idx], idx])
            D.append([total - numbers[idx], idx])
        elif idx == num_len:
            if total == target:
                ans += 1
                
    return ans
            
    
    
def solution(numbers, target):
    return bfs(numbers, target)
