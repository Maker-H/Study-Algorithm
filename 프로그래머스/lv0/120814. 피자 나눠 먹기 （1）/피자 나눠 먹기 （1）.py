# n명, 항상 7조각
def solution(n):
    # 사람이 작으면 1판만 시키면 된다
    if n <= 7:
        return 1
    # 사람이 많으면
    else:
        if n % 7 != 0:
            return n // 7 + 1
        else:
            return n // 7
        
    return answer