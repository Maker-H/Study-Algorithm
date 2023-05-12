def solution(balls, share):
    answer = 1
    for i in range(1, balls + 1):
        answer *= i 
        
    tmp = 1
    for i in range(1, share + 1):
        tmp *= i
    
    for i in range(1, balls - share + 1):
        tmp *= i
        
        
    return answer // tmp