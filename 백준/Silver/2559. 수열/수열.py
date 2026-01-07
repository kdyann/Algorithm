import sys
input = sys.stdin.readline
n, k = map(int, input().split())
nums = list(map(int, input().split()))
s=[0]
result = []
for i in range(n):
    s.append(s[i]+nums[i])
for i in range(n-k+1):
    result.append(s[i+k]-s[i])
print(max(result))