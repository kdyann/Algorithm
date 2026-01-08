import sys
input = sys.stdin.readline
n = int(input())
m = int(input())
count = 0
i = 0 #시작 인덱스
j = n-1 # 종료 인덱스
nums = list(map(int,input().split()))
nums.sort()

while i < j:
    if nums[i]+nums[j] > m:
        j -= 1
    elif nums[i]+nums[j] < m:
        i += 1
    else:
        count += 1
        i += 1
        j -= 1
print(count)