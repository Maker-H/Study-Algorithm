def solution(s):
    stack = []
    
    if len(s) == 1:
        return False
    
    for c in s:
        if c == "(":
            stack.append("(")
        
        if c == ")":
            if len(stack) == 0:
                return False

            if len(stack) != 0 and stack[-1] == "(":
                stack.pop()
                
    if len(stack) == 0:
        return True
    return False