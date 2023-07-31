def solution(distance, rocks, n):
    answer = 0
    start, end = 1, distance # 돌 사이 최소 거리들

    rocks.sort() # 정렬
    rocks += [distance]
    
    while start <= end:
        del_stones = 0
        pre_stone = 0
        mid = (start + end) // 2
        
        for rock in rocks:
            if rock - pre_stone < mid: # 내가 설정한 정답보다 길이가 더 작으면 삭제 해야함 최소값 안되기 때문
                del_stones += 1
            else: # 내가 설정한 정답보다 길이가 더 길면 mid가 최소값이니까 다음 돌로 넘어감
                pre_stone = rock
            if del_stones > n: #제거된 돌이 문제 조건 보다 크면 for문을 나온다
                break
            
        print("start: ", start, "end: ", end, "mid: ", mid, "del_stones: ", del_stones)
        
        if del_stones > n: # 만약 삭제한 돌이 n보다 크다면 너무 많이 지운 것 mid를 더 작게 갱신
            end = mid - 1
        else: # 만약 삭제한 돌이 n보다 작거나 같다면 너무 적게 지운 것 mid를 더 크게 갱신
            start = mid + 1
            answer = mid
    
            
    return answer
        
            
            
        
                
            
    