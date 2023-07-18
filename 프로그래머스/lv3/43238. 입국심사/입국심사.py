def solution(n, times):
    end = max(times) * n
    start = 1
    while start <= end:
        mid = (start + end) // 2
        
        people = 0
        for time in times:
            people += mid // time
        
        
        if people >= n:
            end = mid - 1
            answer = mid
        elif people < n:
            start = mid + 1
    
    return answer