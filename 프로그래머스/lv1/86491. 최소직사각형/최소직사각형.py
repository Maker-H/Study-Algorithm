def solution(sizes):
    tmp_width = tmp_height = 0
    answer = 0
    for size in sizes:
        x = size[0]
        y = size[1]
        
        if size[0] < size[1]:
            x = size[1]
            y = size[0]
            
        if tmp_width < x:
            tmp_width = x
        
        if tmp_height < y:
            tmp_height = y
        
        print(tmp_width, tmp_height)
        answer = tmp_width * tmp_height
    
            
    return answer