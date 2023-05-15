def solution(spell, dic):
    answer = [0] * len(spell)
    for word in dic:
        for c in word:
            for idx in range(len(spell)):
                if spell[idx] == c:
                    answer[idx] += 1
        is_one = True
        for i in answer:
            if i != 1:
                is_one = False
                break
                
        answer = [0] * len(spell)
        
        if is_one == True:
            break
    
    if is_one == False:
        return 2
    else:
        return 1
    
    return answer