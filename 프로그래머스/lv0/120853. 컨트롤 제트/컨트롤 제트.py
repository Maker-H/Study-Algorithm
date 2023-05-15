def solution(s):
    answer = 0
    my_str = s.split(' ')
    
    for idx in range(len(my_str)):
        if my_str[idx] != 'Z':
            answer += int(my_str[idx])
        else:
            answer -= int(my_str[idx - 1])
            
    return answer