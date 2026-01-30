n = int(input())
A = list(map(int, input().split()))
sum = [0]*n

for i in range(1,n):
    findIdx = i
    findValue = A[i]
    for j in range(i-1,-1,-1):
        if A[i] > A[j]:
            findIdx = j+1
            break
        if j == 0:
            findIdx = 0
    for j in range(i,findIdx,-1):
        A[j] = A[j-1]
    A[findIdx] = findValue

sum[0] = A[0] 

for i in range(1,n):
    sum[i] = sum[i-1]+A[i]

answer = 0
for i in range(0,n):
    answer += sum[i]
print(answer)