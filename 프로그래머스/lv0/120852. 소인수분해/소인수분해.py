def solution(n):
    answer = []
    for i in range(2, n + 1):
        if n % i == 0:
            answer.append(i)
            while True:
                n = n // i
                if n % i != 0:
                    break
    return answer