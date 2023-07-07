def solution(brown, yellow):
    answer = []
    # 브라운의 가로 길이는 옐로우 길이보다 2가 길다
    # 브라운의 세로 길이는 옐로우의 길이와 같다
    
    for i in range(1, yellow + 1):
        if yellow % i != 0:
            continue
                
        y_row = yellow // i
        y_col = i
        
        # print(y_row, y_col)
        
        b_row = (y_row + 2) * 2
        b_col = y_col * 2
        
        if b_row + b_col == brown:
            answer = [y_row + 2, y_col + 2]
            
    return sorted(answer, reverse=True)