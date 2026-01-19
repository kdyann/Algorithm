from collections import deque
import sys
input = sys.stdin.readline 
n = int(input())
queue = deque(range(1, n+1))

while len(queue) > 1:
    queue.popleft()
    
    if len(queue) == 1:
        break

    top_card = queue.popleft()
    queue.append(top_card)

print(queue[0])
