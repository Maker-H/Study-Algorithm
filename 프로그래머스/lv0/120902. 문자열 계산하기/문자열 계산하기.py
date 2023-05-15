def solution(my_string):
    answer = 0
    numbers = []
    op = []
    tmp = ''
    for c in my_string:
        if c.isdigit():
            tmp += c
        elif c == ' ':
            pass
        else:
            numbers.append(int(tmp))
            tmp = ''
            op.append(c)
            
    if tmp != '':
        numbers.append(int(tmp))
    
    op_idx = 0
    for i in range(1, len(numbers)):
        if op[op_idx] == '+':
            numbers[i] += numbers[i - 1]
        elif op[op_idx] == '-':
            numbers[i] = numbers[i - 1] - numbers[i]
        
        op_idx += 1
        if op_idx == len(op):
            break
            
    return numbers[-1]