from collections import defaultdict
def solution(clothes):
    # print(clothes)
    closet = defaultdict(list)
    
    for cloth, type in clothes:
        # print(cloth, type)
        closet[type].append(cloth)
    # print(closet)
        
    answer = 1
    for c in closet:
        # print(closet[c])
        answer *= len(closet[c]) + 1
    # print(answer)
    return answer - 1
        