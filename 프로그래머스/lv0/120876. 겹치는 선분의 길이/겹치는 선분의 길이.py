def solution(lines):
    answer = 0
    lines.sort(key = lambda x: (x[0], x[1]))
    new_lines = []
    
    if lines[0][1] > lines[2][1]:
        new_lines.append(lines[1])
        new_lines.append(lines[2])
    else: 
        if lines[0][0] != lines[1][0] and lines[0][1] > lines[1][0] and lines[0][1] > lines[1][1] :
            new_lines.append([lines[1][0], lines[1][1]])
        elif lines[0][0] != lines[1][0] and lines[0][1] > lines[1][0] and lines[0][1] < lines[1][1] :
            new_lines.append([lines[1][0], lines[0][1]])
        elif lines[0][0] == lines[1][0] and lines[0][1] > lines[1][1]:
            new_lines.append([lines[0][0], lines[1][1]])
        elif lines[0][0] == lines[1][0] and lines[1][1] >= lines[0][1]:
            new_lines.append([lines[0][0], lines[0][1]])


        if lines[2][0] < lines[1][1] < lines[2][1]:
            new_lines.append([lines[2][0], lines[1][1]])
        elif lines[2][1] <= lines[1][1]:
            new_lines.append([lines[2][0], lines[2][1]])
    
    new_lines.sort()
    if len(new_lines) == 0:
        return 0
    elif len(new_lines) == 1:
        return new_lines[0][1] - new_lines[0][0]
    else:
        if new_lines[0][1] > new_lines[1][0]:
            answer = new_lines[1][1] - new_lines[0][0]
        else:
            answer += new_lines[0][1] - new_lines[0][0]
            answer += new_lines[1][1] - new_lines[1][0]
    
    return answer