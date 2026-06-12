nums=[1,0,-1,4,2,-2,-4]
dct={}
dct[0]=1
sum=0
count=0

for i in range(len(nums)):
    sum+=nums[i]

    if dct.get(sum):
        count+=dct.get(sum)
        dct[sum]=dct.get(sum)+1
    else:
        dct[sum]=1
print(count)