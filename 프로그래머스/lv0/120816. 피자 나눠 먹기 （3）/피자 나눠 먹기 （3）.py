# 피자는 열조각까지 잘라준다
# n명의 사람
def solution(slice, n):
    
    # 피자 조각이 더 많으면 한 판만 시키면 됨
    if n  <= slice:
        return 1
    # 사람이 더 많다면
    else:
        if n % slice != 0:
            return n // slice + 1
        else:
            return n // slice
        