import sys
input = sys.stdin.readline
n,m = map(int, input().split())
a = list(map(int, input().split())) # 기존
s = [0]*n # 합 배열
c = [0]*m # 카운트 배열
result = 0
for i in range(n):
    s[i]=s[i-1]+a[i]
for i in range(0,n):
    r = s[i] % m # 나머지 구하기
    if r == 0:
        result += 1
    c[r] += 1
for i in range(m):
    if c[i]>1:
        result += (c[i]*(c[i]-1))//2
print(result)