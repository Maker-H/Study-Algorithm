import sys
INF = int(1e9)
city = int(sys.stdin.readline())
bus = int(sys.stdin.readline())

graph = [[INF] * (city + 1) for _ in range(city + 1)]

for i in range(1, city + 1):
    for j in range(1, city + 1):
        if i == j:
            graph[i][j] = 0

for _ in range(bus):
    s, e, c = map(int, sys.stdin.readline().split())
    graph[s][e] = min(c, graph[s][e])

for k in range(1, city + 1):
    for i in range(1, city + 1):
        for j in range(1, city + 1):
            graph[i][j] = min(graph[i][j], graph[i][k] + graph[k][j])

for i in range(1, city + 1):
    for j in range(1, city + 1):
        if graph[i][j] == INF:
            print('0', end= " ")
        else:
            print(graph[i][j], end=" ")
    print()