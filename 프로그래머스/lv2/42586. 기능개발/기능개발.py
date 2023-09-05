import math
def solution(progresses, speeds):
    days = [] 

    for i in range(len(progresses)):
        days.append(math.ceil((100 - progresses[i]) / speeds[i]))
    print(days)
    
    tmp = days[0]
    cnt = 0
    answer = []
    for i, d in enumerate(days):
        if i == 0:
            cnt = 1
            continue
        print("d ", d, "cnt ", cnt)
        if d > tmp:
            tmp = d
            answer.append(cnt)
            cnt = 0
        cnt += 1
        
    # print(cnt)
    if cnt != 0:
        answer.append(cnt)
        
    return answer
        