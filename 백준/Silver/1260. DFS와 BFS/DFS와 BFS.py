from collections import deque

def main():

    def dfs(node):
        visited[node] = -1
        print(node, end=" ")
        for n in tree[node]:
            if visited[n] != -1:
                dfs(n)

    def bfs(node):
        D = deque()
        D.append(node)

        while D:
            # print(node, "D - ", D)
            node = D.popleft()

            if visited[node] == -1:
                continue

            print(node, end=" ")

            visited[node] = -1

            for n in tree[node]:
                if visited[n] != -1:
                    D.append(n)

    
    N, M, V = map(int, input().split())
    tree = [[] for _ in range(N + 1)]
    visited = [0] * (N + 1)

    for _ in range(M):
        a, b = map(int, input().split())
        a = int(a)
        b = int(b)

        tree[a].append(b)
        tree[b].append(a)

    for t in tree:
        t.sort()

    # print(tree)
    
    dfs(V)
    visited = [0] * (N + 1)
    print()
    bfs(V)
    



    return

main()
