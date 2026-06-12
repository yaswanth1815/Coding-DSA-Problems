nums=[-1,0,1,4,2,-2,-4,5]
sum=0
dct={}
dct[0]=[-1]
target=5

for i in range(len(nums)):
    sum+=nums[i]
    if dct.get(sum-target):
        lst=dct.get(sum-target)
        for k in lst:
            print(nums[k+1:i+1])

    if dct.get(sum):
        dct.get(sum).append(i)
    else:
        dct[sum]=[i]