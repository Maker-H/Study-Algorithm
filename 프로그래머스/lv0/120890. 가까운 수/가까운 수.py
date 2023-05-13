def solution(array, n):
    answer = []
    tmp = []
    for i in array:
        tmp.append(abs(n - i))
    
    # tmp 안에 존재할 수 있는 중복된 가까운 수 있는지 확인
    closest = min(tmp)
    for idx in range(len(tmp)):
        # tmp의 값과 일치하는 array 수를 answer에 넣기
        if tmp[idx] == closest:
            answer.append(array[idx])

    if len(answer) == 1:
        return answer[0]
    else:
        return min(answer)
            
