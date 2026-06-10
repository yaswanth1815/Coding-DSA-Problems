k=4
num=[40,30,22,1,34,56,78,99]
summ=0
for i in range(k):
    summ+=num[i]
maxx=summ
left=k-1
right=len(num)-1

while(right>=k and left>=0):
    summ=summ-num[left]+num[right]
    maxx=max(maxx,summ)
    left-=1
    right-=1
print(maxx)