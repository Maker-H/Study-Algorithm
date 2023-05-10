def solution(str1, str2):
    answer = []
    s_len = len(str2)
    

    for idx in range(0, len(str1) - s_len + 1):
        tmp = str1[idx : idx + s_len]
        # answer.append(tmp)
        
        if tmp == str2:
            return 1
        
    return 2