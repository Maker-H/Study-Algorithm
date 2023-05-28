def solution(a, b):
    for i in range(2, (min(a, b) + 1)):
        if a % i == 0 and b % i == 0:
            a = a // i
            b = b // i
    
    while b % 5 == 0:
        b = b // 5
    while b % 2 == 0:
        b = b // 2
    
    if b != 1:
        return 2
    else:
        return 1
    
