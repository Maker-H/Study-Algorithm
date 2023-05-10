# n = 양꼬치 n인분
# k = 음료수 k개
def solution(n, k):
    # n개에 대한 서비스 음료수 개수 
    free_drink = n // 10 
    
    # 지불해야할 음료수 개수
    pay_drink = k - free_drink

    return n * 12000 + pay_drink * 2000