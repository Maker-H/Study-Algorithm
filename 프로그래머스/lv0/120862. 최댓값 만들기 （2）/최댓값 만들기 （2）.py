def solution(numbers):
    max_ = -10000 * 10001
    tmp = []
    for idx1 in range(len(numbers)):
        for idx2 in range(len(numbers)):
            i = numbers[idx1]
            j = numbers[idx2]
            
            if idx1 == idx2:
                continue
            else:
                if i * j > max_:
                    max_ = i * j
    return max_