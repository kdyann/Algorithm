from collections import deque
import sys
input = sys.stdin.readline
n, k = map(int,input().split())
queue = deque(range(1, n+1))
answer = []
print("<", end='')
while len(queue) > 1:
    for i in range(k-1):
        queue.append(queue.popleft())
    print(str(queue.popleft())+", ", end='')
print(str(queue.popleft())+">")