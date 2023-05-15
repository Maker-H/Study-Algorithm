from collections import Counter
def solution(s):
    answer = []
    
    cnt = Counter(s)
    for (val, num) in cnt.most_common():
        if num == 1:
            answer.append(val)
            
            
    return ''.join(sorted(answer))