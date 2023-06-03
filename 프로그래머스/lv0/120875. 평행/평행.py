def solution(dots):
    answer = []
    for i in range(1, len(dots)):
        i_inclination = 0
        ix_change = dots[0][0] - dots[i][0]
        iy_change = dots[0][1] - dots[i][1]
        
        if iy_change != 0:
            i_inclination = ix_change / iy_change
        
        j_inclination = 0
        tmp_x = -1
        tmp_y = -1
        for j in range(1, 4):
            if j == i: continue
            if tmp_x == -1:
                tmp_x = j
            elif tmp_y == -1:
                tmp_y = j
            elif tmp_x != -1 and tmp_y != -1:
                break
        jx_change = dots[tmp_x][0] - dots[tmp_y][0]
        jy_change = dots[tmp_x][1] - dots[tmp_y][1]
        
        if jy_change != 0:
            j_inclination = jx_change / jy_change
        
        if j_inclination == i_inclination: return 1
        
    return 0
    
