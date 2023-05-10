def solution(n, t):
    while t != 0:
        n *= 2
        t -= 1
    return n