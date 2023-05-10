def solution(numbers):
    max_ = 0
    for i in range(0, len(numbers)):
        for j in range(i + 1, len(numbers)):
            if numbers[i] * numbers[j] > max_:
                max_ = numbers[i] * numbers[j]
    
    return max_