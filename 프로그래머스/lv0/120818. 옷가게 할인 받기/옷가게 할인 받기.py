import math

def solution(price):
    answer = price
    
    if 300000 > price >= 100000:
        answer = price * 0.95
    elif 500000 > price >= 300000:
        answer = price * 0.9
    elif price >= 500000:
        answer = price * 0.8

    return math.trunc(answer)