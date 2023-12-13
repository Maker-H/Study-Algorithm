
def main():
    N = int(input())

    for test in range(1, N + 1):
        divide_sum = test
        test = str(test)

        test_to_list = list(test)

        for t in test_to_list:
            divide_sum += int(t)
        
        if divide_sum == N:
            print(test)
            return
        
    
    print(0)
    return
                


main()