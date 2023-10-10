from collections import defaultdict
def solution(name, yearning, photo):
    scores = defaultdict(int)
    for i, n in enumerate(name):
        scores[n] = yearning[i]
        
    print(scores)
    
    answer = []
    for pho in photo:
        total = 0
        
        for p in pho:            
            total += scores[p]
        answer.append(total)
                    
    return answer