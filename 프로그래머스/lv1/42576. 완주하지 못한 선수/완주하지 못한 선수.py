def solution(participant, completion):
    participant.sort()
    completion.sort()
    
    for i in range(len(participant)):
        if i < len(completion) and participant[i] != completion[i]:
            return participant[i]
        elif i == len(completion):        
            return participant[-1]