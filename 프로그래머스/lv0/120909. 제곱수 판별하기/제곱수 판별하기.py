import math

def solution(n):
    if math.sqrt(n) - math.trunc(math.sqrt(n)) != 0:
        return 2
    return 1