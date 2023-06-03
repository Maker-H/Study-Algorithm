def solution(num, total):
    for re in range(0 - num, total + 1):
        my_total = []
        
        for i in range(re, re + num):
            my_total.append(i)
        
        if sum(my_total) == total:
            return my_total
            
