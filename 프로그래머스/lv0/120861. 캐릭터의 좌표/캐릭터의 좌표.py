def solution(keyinput, board):
    f = s = 0
    
    # board의 크기가 9라면 왼쪽으로 최대 -4까지
    width_len = board[0] // 2
    col_len = board[1] // 2
    for key in keyinput:
        if key == 'up':
            f += 1
        elif key == 'down':
            f -= 1
        elif key == 'right':
            s += 1
        elif key == 'left':
            s -= 1
        
        if s > width_len:
            s = width_len
        elif s < -width_len:
            s = -width_len
        
        if f > col_len:
            f = col_len
        elif f < -col_len:
            f = -col_len

    return [s, f]