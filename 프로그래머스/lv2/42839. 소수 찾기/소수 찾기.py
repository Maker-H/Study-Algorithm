import itertools
def solution(numbers):
    per = []
    for i in range(1, len(numbers) + 1):
        per += list(itertools.permutations(numbers, i))

    tmp_new_nums = [int(("").join(p)) for p in per]
    
    new_nums = set(tmp_new_nums)
    answer = []
    for num in new_nums:
        if num == 0 or num == 1:
            continue
        
        flag = True
        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                flag = False
                break
        if flag:
            answer.append(num)
            
    return len(answer)