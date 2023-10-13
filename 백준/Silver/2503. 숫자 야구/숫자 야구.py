from itertools import permutations
from itertools import combinations
def main():
    N = int(input())
    nums = []
    strikes = []
    balls = []
    answer = 0

    for _ in range(N):
        num, strike, ball = list(map(int, input().split()))
        nums.append(str(num))
        strikes.append(strike)
        balls.append(ball)

    for i in range(123, 988):
        i_list = list(str(i))
        tmp = False

        if '0' in i_list or len(set(i_list)) != 3:
            continue

        for num_i, num in enumerate(nums):
            num_list = list(num)
            b = 0
            s = 0
            for ci, c in enumerate(i_list):
                for ni, n in enumerate(num_list):
                    if ci == ni and c == n:
                        s += 1
                    elif c == n:
                        b += 1

            if balls[num_i] != b or strikes[num_i] != s:
                tmp = True
                break

        if not tmp:
            answer += 1

    print(answer)




if __name__ == '__main__':
    main()

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
