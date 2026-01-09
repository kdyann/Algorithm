import sys
input = sys.stdin.readline
n = int(input())
a = [0] * n
for i in range(n):
    a[i] = int(input())
stack = []
answer = []
num = 1

for i in range(n):
    if a[i] >= num:
        while a[i] >= num:
            stack.append(num)
            num += 1
            answer.append("+")
        stack.pop()
        answer.append("-")
    else:
        if stack[-1] != a[i]:
            print("NO")
            sys.exit()
        else:
            stack.pop()
            answer.append("-")
for x in answer:
    print(x)