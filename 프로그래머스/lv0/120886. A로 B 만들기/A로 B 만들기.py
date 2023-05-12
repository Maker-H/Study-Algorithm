def solution(before, after):
    before_dict = {}
    after_dict = {}
    
    for c in before:
        if c not in before_dict:
            before_dict[c] = 0
        else:
            before_dict[c] += 1
    
    for c in after:
        if c not in after_dict:
            after_dict[c] = 0
        else:
            after_dict[c] += 1
    
    # before에 있는 단어가 after에도 있고 그 개수도 일치하는지 확인
    for key in before_dict.keys():
        if not (key in after_dict and before_dict[key] == after_dict[key]):
            return 0
        
    return 1
        
    
