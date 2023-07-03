def solution(nums):
    have_len = len(nums) // 2
    nums.sort()
    # print(nums)
    
    tmp = 0
    cnt = 0
    for n in nums:
        if n != tmp:
            tmp = n
            cnt += 1
    
    if cnt >= have_len:
        return have_len
    else:
        return cnt
