def solution(my_string):
    answer = ''
    for ch in my_string:
        if ch.isupper():
            answer += ch.lower()
        elif ch.islower():
            answer += ch.upper()
    return answer