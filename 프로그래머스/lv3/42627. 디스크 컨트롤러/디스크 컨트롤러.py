import heapq
def solution(jobs):
    answer = count = i = 0
    start = -1
    end = 0
    heap = []

    while len(jobs) > i:
        for job in jobs:
            if start < job[0] <= end:
                heapq.heappush(heap, [job[1], job[0]])

        if heap:
            job = heapq.heappop(heap)
            start = end
            end += job[0]
            answer += end - job[1]
            i += 1
        else:
            end += 1

    return answer // len(jobs)
            
