def solution(people, limit):
    people.sort()
    answer = 0
    
    total = start = 0
    end = len(people) - 1
    visited = [False for _ in range(len(people))]
    while start < end:
        # print("start:", start, "end: ", end, "answer: ", answer)
        
        if people[start] + people[end] <= limit:
            visited[end] = visited[start] = True
            end -= 1
            start += 1
            answer += 1
        else:
            visited[end] = True
            end -= 1
            answer += 1
        # print("<after> start:", start, "end: ", end, "answer: ", answer)
    if False in visited:
        answer += 1
    return answer
    
