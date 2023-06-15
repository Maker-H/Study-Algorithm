import math
def solution(progresses, speeds):
    answer = []
    days = []
    for i in range(len(progresses)):
        days.append(math.ceil((100 - progresses[i]) / speeds[i]))

    tmp = days[0]
    count = 1
    for i in range(1, len(days)):
        if tmp < days[i]:
            answer.append(count)
            count = 1
            tmp = days[i]
        else:
            count += 1
            
    answer.append(count)
        
    return answer