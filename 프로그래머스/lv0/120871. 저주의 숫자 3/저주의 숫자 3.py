def solution(n):
    target = 1
    uni = 1
    
    while True:
        if uni == n:
            break
        uni += 1
        
        while True:
            is_three = True
            is_div = True
            
            target += 1
            
            if target % 3 != 0:
                is_three = False
            
            flag = True
            for c in str(target):
                if c == '3':
                    flag = False
                    break
            if flag:
                is_div = False
            
            if not (is_three or is_div):
                break
                
        
    return target