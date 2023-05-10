def solution(num_list):
    answer = [0, 0]
    for num in num_list:
        # 만약 num이 짝수라면
        if num % 2 == 0:
            answer[0] += 1
        # 만약 num이 홀수라면
        else:
            answer[1] += 1
    return answer