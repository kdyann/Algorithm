import sys
input = sys.stdin.readline
n = int(input())
nums = list(map(int,input().split()))
nums.sort()
count = 0

for k in range(n):
    i = 0
    j = n-1
    while i < j:
        if nums[i]+nums[j] == nums[k]:
            if i != k and j != k:
                count += 1
                break
            elif i == k:
                i += 1
            elif j == k:
                j -= 1
        elif nums[i]+nums[j] > nums[k]:
            j -= 1
        else:
            i += 1
print(count)