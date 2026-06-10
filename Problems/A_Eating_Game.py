test=int(input())

for i in range(test):
    count=int(input())
    strs=input().split(" ")
    lst=[]
    for i in strs:
        lst.append(int(i))
    count=0
    maxi=max(lst)
    for i in lst:
        if i==maxi:
            count+=1
    print(count)

