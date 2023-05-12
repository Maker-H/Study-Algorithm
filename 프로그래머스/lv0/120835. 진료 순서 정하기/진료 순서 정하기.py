def solution(emergency):
    sort_emergency = sorted(emergency, reverse=True)
    
    answer = []
    for num in emergency:
        answer.append(sort_emergency.index(num) + 1)
    return answer