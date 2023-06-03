def solution(babbling):
    answer = 0
    for word in babbling:
        
        flag = True
        idx = 0
        while idx < len(word):
            if word[idx : 3 + idx] == 'aya' or word[idx : 3 + idx] == 'woo':
                idx += 3
            elif word[idx : 2 + idx] == 'ye' or word[idx : 2 + idx] == 'ma':
                idx += 2
            else:
                flag = False
                break
        
        if flag:
            answer += 1
            
    return answer
            