from collections import defaultdict
def solution(clothes):
    closet = defaultdict(list)
    
    for name, c_type in clothes:
        closet[c_type].append(name)

    c_list = []
    for e in closet:
        c_list.append(len(closet[e]) + 1)
    
    answer = 1
    for i in c_list:
        answer *= i
        
    return answer - 1