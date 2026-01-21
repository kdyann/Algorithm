from queue import PriorityQueue
import sys
print = sys.stdout.write
input = sys.stdin.readline
n = int(input())
queue = PriorityQueue()

for i in range(n):
    x = int(input())
    if x == 0:
        if queue.empty():
            print('0\n')
        else:
            temp = queue.get()
            print(str((temp[1]))+'\n')
    else:
        queue.put((abs(x), x))
