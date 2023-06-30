def solution(citations):
    answer = 0
    citations.sort()
    
    for num in range(citations[-1], -1, -1):
        tmp = -1
        for i in range(len(citations)):
            if num <= citations[i]:
                tmp = i
                break
        
        if num <= len(citations[i:]):
            # print(citations[i:], num)
            return num
            