from itertools import combinations
def solution(nums):
    collect_nums = len(nums) // 2
    nums = set(nums)
    
    if len(nums) > collect_nums:
        return collect_nums
    else:
        return len(nums)
    
    