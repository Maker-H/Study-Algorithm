def solution(n, lost, reserve):
    student = [0 for _ in range(n + 1)]
    
    for l in lost:
        student[l] -= 1
    
    for r in reserve:
        student[r] += 1
    
    print(student)
    for s in range(1, len(student)):
        if student[s] == -1:
            if student[s - 1] == 1:
                student[s] = student[s - 1] = 0  
            elif s < len(student) - 1 and student[s + 1] == 1:
                student[s] = student[s + 1] = 0

    print(student)
    cnt = 0
    for s in student:
        if s == -1:
            cnt -= 1


    if  cnt + n <= 0:
        return 0
    elif cnt == 0:
        return n
    else:
        return cnt + n
