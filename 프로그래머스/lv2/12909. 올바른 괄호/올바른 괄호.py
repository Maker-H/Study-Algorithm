def solution(s):
    stack = []
    for c in s:
        if c == '(':
            stack.append(c)
        if c == ')':
            if len(stack) == 0:
                return False
            stack.pop()
            
    if len(stack) == 0:
        return True
    
    return False
    
    