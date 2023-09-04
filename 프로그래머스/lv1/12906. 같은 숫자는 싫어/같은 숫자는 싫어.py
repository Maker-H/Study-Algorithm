def solution(arr):
    answer = [arr[0]]
    
    tmp = arr[0]
    for i, a in enumerate(arr):
        # print("i: ", i, "a: ", a)
        if i == 0:
            continue
        
        if a != tmp:
            tmp = a
            answer.append(a)
    
    return answer