from itertools import permutations
def solution(k, dungeons):
    orders = list(permutations(list(i for i in range(len(dungeons))), len(dungeons)))
    
    # print(orders)
    answer = -1
    cnt = 0
    origin_k = k
    for order in orders:
        for i in order:
            min_fatigue = dungeons[i][0]
            consume_fatigue = dungeons[i][1]
            
            if min_fatigue <= k:
                cnt += 1
                k -= consume_fatigue
                
        # print(cnt)
        if answer < cnt:
            answer = cnt
        cnt = 0
        k = origin_k
            
    return answer