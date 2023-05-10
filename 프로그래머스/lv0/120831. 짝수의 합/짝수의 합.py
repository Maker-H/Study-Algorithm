def solution(n):
    sum_ = 0
    for i in range(0, n + 1, 2):
        sum_ += i
    return sum_