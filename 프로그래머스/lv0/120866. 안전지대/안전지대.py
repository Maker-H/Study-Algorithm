def solution(board):
    answer = 0
    for y in range(len(board)):
        for x in range(len(board)):
            is_bomm = True
            for kx, ky in [[0, 0], [1, 0], [-1, 0], [0, 1], [0, -1],[1, 1], [1, -1], [-1, 1], [-1, -1]]:
                nx = x + kx
                ny = y + ky
                if 0 <= nx < len(board) and 0 <= ny < len(board):
                    if board[ny][nx] == 1:
                        is_bomm = False
                        break
            
            if is_bomm:
                answer += 1
                
    return answer