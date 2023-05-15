def solution(sides):
    longer = max(sides)
    shorter = min(sides)
    answer = 0
    
    
    # sides안에 가장 긴 변이 있는 경우
    for i in range(1, longer + 1):
        if i + shorter <= longer:
            continue
        else:
            answer += 1
    
    # 나머지 한 변이 가장 길 경우
    for i in range(longer + 1, sum(sides)):
        answer += 1
            
    return answer