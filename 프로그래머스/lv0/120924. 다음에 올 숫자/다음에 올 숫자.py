def solution(common):
    a1 = common[1] - common[0]
    if common[1] and common[0]:
        a2 = common[1] // common[0]
    c_len = len(common) - 1
    
    if common[1] + a1 == common[2]:
        return common[c_len] + a1
    else:
        return common[c_len] * a2