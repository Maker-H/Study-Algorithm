def solution(participant, completion):
    participant.sort()
    completion.sort()
    
    for idx, c in enumerate(completion):
        # print("participant", participant[idx], "completion", c)
        if participant[idx] != c:
            return participant[idx]
    
    return participant[-1]