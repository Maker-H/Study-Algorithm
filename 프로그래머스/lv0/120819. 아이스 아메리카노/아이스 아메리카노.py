import math
def solution(money):
    coffee = math.trunc(money / 5500)
    return [coffee, money - coffee * 5500 ]