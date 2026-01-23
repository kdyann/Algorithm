import sys
input = sys.stdin.readline
n = int(input())
k = [int(input()) for _ in range(n)]
for i in range(n):
    for j in range(n-i-1):
        if k[j] > k[j+1]:
            temp = k[j+1]
            k[j+1]= k[j]
            k[j]= temp

for num in k:
    print(num)