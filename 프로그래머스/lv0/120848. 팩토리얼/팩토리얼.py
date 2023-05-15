def solution(n):
    for i in range(1, 100):
        total = 1
        for j in range(1, i + 1):
            total *= j

        if total > n:
            return i - 1
        
