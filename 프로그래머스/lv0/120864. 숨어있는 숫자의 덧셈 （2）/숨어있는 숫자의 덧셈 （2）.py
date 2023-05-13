def solution(my_string):
    answer = 0
    tmp = ''
    my_string += ' '
    for c in my_string:
        if c.isdigit():
            tmp += c
        if tmp != '' and not c.isdigit():
            answer += int(tmp)
            tmp = ''
            
    return answer