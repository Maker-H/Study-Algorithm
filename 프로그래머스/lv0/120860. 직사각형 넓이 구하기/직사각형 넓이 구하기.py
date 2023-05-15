def solution(dots):
    answer = 0
    ys = []
    xs = []
    for x, y in dots:
        xs.append(x)
        ys.append(y)
        
    return (max(ys) - min(ys)) * (max(xs) - min(xs)) 
