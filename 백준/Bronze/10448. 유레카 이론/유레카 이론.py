
def main():
    N = int(input())
    triangles = []
    in_list = []
    

    for _ in range(N):
        in_list.append(int(input()))

    max_in_list = max(in_list)

    # 인풋수 중 가장 큰 수를 기준으로 삼각함수 구하기
    for num in range(1, max_in_list):
        tmp_triange = num * (num + 1) // 2

        triangles.append(tmp_triange)
        # 더 크면 삼각함수 세개로 안됨으로 끝
        if tmp_triange > max_in_list:
            break

    # print("triangels - ", triangles)
    for num in in_list:
        # 만약 triangles 길이가 3개가 안되면 어차피 안됨
        if len(triangles) < 3:
            print(0)
            continue

        flag = False
        for i in triangles:
            for j in triangles:
                for k in triangles:
                    if i + j + k == num:
                        print(1)
                        # print(" i + j + k - ", i, " ", j, " ", k)
                        flag = True
                        break
                if flag:
                    break
            if flag:
                break
        if not flag:
            print(0)
        


    return
                


main()

# 1의 경우 삼각수 - 1
# 2의 경우 삼각수 - 3
# 3의 경우 삼각수 - 6
# 4의 경우 삼각수 - 