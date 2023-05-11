def solution(age):
    # a = 97
    answer = ''
    dic = {}
    for i in range(97, 110):
        dic[i - 97] = chr(i)
        
    for num in str(age):
        answer += dic.get(int(num))

    return answer