def solution(N, number):
    if number == 1:
        return 1

    # mutable한 리스트로 한 번 감싸고 set으로 변환
    dp = [set([int(str(N) * i)]) for i in range(1, 9)]
    
    print(dp)
    for i in range(8):
        for j in range(i):
            
            # print("======i, j========", i)
            # print("dp[j]", j, ", ", dp[j])
            # print("dp[i-j-1]", i - j - 1, ", ",dp[i - j - 1])
            # i=2 이면 j=0, 1 / (i-j-1)=1, 0
            # i=3 이면 j=0, 1, 2 / (i-j-1)=2, 1, 0
            for n1 in dp[j]:
                for n2 in dp[i - j - 1]:
                    
                    dp[i].add(n1 + n2)
                    dp[i].add(n1 - n2)
                    dp[i].add(n1 * n2)
                    if n2 != 0:
                        dp[i].add(n1 // n2)
        
        if number in dp[i]:
            return i + 1
    return -1
                        