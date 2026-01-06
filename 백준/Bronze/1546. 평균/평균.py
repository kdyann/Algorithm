n = int(input())
realscore = list(map(int,input().split()))
m = max(realscore)
total = sum(realscore)

average = (total/m*100)/n
print(average)