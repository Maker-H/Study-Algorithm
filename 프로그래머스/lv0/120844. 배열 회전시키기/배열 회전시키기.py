from collections import deque
def solution(numbers, direction):
    answer = []
    numbers_d = deque(numbers)
    if direction == 'right':
        tmp = numbers_d.pop()
        numbers_d.appendleft(tmp)
    else:
        numbers_d.append(numbers_d[0])
        numbers_d.popleft()
        
    return list(numbers_d)