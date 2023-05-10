def solution(numer1, denom1, numer2, denom2):
    first = [numer1, denom1]
    second = [numer2, denom2]
    
    # 더 큰 분모를 구해준다
    if denom1 > denom2:
        bigger = first
        smaller = second
    else:
        bigger = second
        smaller = first
        

    # 분모가 배수인지 확인
    # 분모가 배수라면
    if bigger[1] % smaller[1] == 0:
        multiple = bigger[1] // smaller[1]
        smaller[0], smaller[1] = smaller[0] * multiple, smaller[1] * multiple 
        
    # 분모가 배수가 아니라면
    else:
        tmp = bigger[1]
        bigger[0], bigger[1] = bigger[0] * smaller[1], bigger[1] * smaller[1]
        smaller[0], smaller[1] = smaller[0] * tmp, smaller[1] * tmp
    
    # 분수의 합 구하기
    answer = [bigger[0] + smaller[0], bigger[1]]
    
    # 분수의 합을 기약 분수로 만들어준다
    for i in range(1000, 1, -1):
        if (answer[0] % i == 0) and (answer[1] % i == 0):
            answer[0], answer[1] = answer[0] // i, answer[1] // i 
            
            
    return answer