# 장군개미 5
# 병정개미 3
# 일개미 1

def solution(hp):
    answer = 0
    
    general = hp // 5
    hp = hp - general * 5
    
    army = hp // 3
    hp = hp - army * 3
    
    work = hp
    
    return general + army + work