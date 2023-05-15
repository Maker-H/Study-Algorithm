def solution(numbers, k):
    turn = 0
    for i in range(k - 1):
        turn = (turn + 2) % len(numbers)
            
    return numbers[turn]
    