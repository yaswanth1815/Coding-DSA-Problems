nums=[1,0,1,4,2,-2,-4,5]
sum=0
dct={}
dct[0]=1
target=5
count=0

for i in range(len(nums)):
    sum+=nums[i]
    val=sum-target

    if dct.get(val):
        count+=dct[val]
    dct[sum]=dct.setdefault(sum,0)+1
print(count)

