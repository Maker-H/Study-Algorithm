def solution(triangle):
    answer = 0
    for t_idx in range(len(triangle)):
        for n_idx in range(len(triangle[t_idx])):
            if t_idx == 0:
                break
            
            if n_idx == 0:
                triangle[t_idx][n_idx] += triangle[t_idx - 1][n_idx]
            elif n_idx == len(triangle[t_idx]) - 1:
                triangle[t_idx][n_idx] += triangle[t_idx - 1][n_idx - 1]
            else:
                triangle[t_idx][n_idx] += max(triangle[t_idx - 1][n_idx - 1], triangle[t_idx - 1][n_idx])

    # for i in triangle:
    #     print(i)
    return max(triangle[len(triangle) - 1])