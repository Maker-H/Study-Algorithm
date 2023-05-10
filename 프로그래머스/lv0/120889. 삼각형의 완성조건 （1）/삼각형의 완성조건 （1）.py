def solution(sides):
    answer = 0
    
    side_max = 0
    for idx in range(0, 3):
        if sides[idx] > side_max:
            side_max = sides[idx]

    if sum(sides) - side_max > side_max:
        return 1
    else:
        return 2
    