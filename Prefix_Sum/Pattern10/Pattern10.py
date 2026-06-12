tar=5
arr=[1,0,1,4,2,-2,-4,5]
dct={}
dct[0]=1
sum=0
count=0

for i in range(len(arr)):
    sum+=arr[i]
    rem=((sum%tar)+tar)%tar
    if dct.get(rem):
        count+=dct.get(rem)
    dct[rem]=dct.setdefault(rem,0)+1
print(count)
