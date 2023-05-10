def solution(my_string):
    arr = ['a', 'e', 'i', 'o', 'u']
    answer = ''

    for ch in my_string:
        # 기본적으로 다르다고 전제 한 뒤
        is_diff = True

        for remove in arr:
            # 한 번이라도 같으면 포함하지 않는다
            if ch == remove:
                is_diff = False
        
        if is_diff == True:
            answer += ch
            
    return answer