def solution(number, k):
    answer = []
    for i in number:
        if len(answer) == 0:
            answer.append(i)
            continue
        if k > 0:
            # 만약 스택의 마지막 값이 현재 값보다 작다면
            while answer[-1] < i:
                answer.pop() # 삭제
                k -= 1 # 하나 삭제했으므로 하나 덜 삭제해도 됨
                if len(answer) == 0 or k <= 0: # 다 삭제했다면 끝
                    break
        answer.append(i)
    
    if k > 0:
        answer = answer[:-k]
    return ''.join(answer)        
        
            