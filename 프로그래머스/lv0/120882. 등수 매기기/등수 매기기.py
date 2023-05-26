def solution(score):
    count = [0] * 100
    new_score = []
    dic = {}
    
    for e, m in score:
        new_score.append((e + m) / 2)

    rank = 1
    for num in sorted(new_score, reverse=True):
        if num not in dic.keys():
            dic[num] = rank
            rank += 1
        else:
            rank += 1
    
    for idx in range(len(new_score)):
        new_score[idx] = dic[new_score[idx]] 
        
    return new_score
    