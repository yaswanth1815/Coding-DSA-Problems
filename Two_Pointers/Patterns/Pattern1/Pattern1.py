lst=[15,1,23,20,58,5,2,14]
k=3
summ=0
for i in range(3):
    summ+=lst[i]
maxx=summ
left=0
right=3

while right<len(lst):
    summ=summ-lst[left]+lst[right]
    maxx=max(summ,maxx)
    left+=1
    right+=1

print(maxx)
