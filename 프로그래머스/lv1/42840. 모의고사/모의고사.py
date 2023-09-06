def solution(answers):
    s1 = [1, 2, 3, 4, 5]
    s2 = [2, 1, 2, 3, 2, 4, 2, 5]
    s3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    s1_len = len(s1)
    s2_len = len(s2)
    s3_len = len(s3)
    
    ans = [0, 0, 0]
    s1_i = s2_i = s3_i = 0
    
    for a in answers:
        
        if a == s1[s1_i]:
            ans[0] += 1
        
        if a == s2[s2_i]:
            ans[1] += 1
        
        if a == s3[s3_i]:
            ans[2] += 1
            
        s1_i = (s1_i + 1) % s1_len
        s2_i = (s2_i + 1) % s2_len
        s3_i = (s3_i + 1) % s3_len
    # print(ans)
    
    ans_max = max(ans)
    
    if ans_max == 0:
        return []
    
    answer = []
    for i, a in enumerate(ans):
        if ans_max == a:
            answer.append(i + 1)
            
    # print(answer)
    return answer
        