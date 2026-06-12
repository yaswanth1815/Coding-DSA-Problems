nums=[1,0,1,4,2,-2,-4,5]
div=5
sum=0
dct={}
dct[0]=[-1]

for i in range(len(nums)):
    sum+=nums[i]
    rem=((sum%div)+div)%div

    if dct.get(rem):
        lst=dct.get(rem)
        for j in lst:
            print(nums[j+1:i+1])
        dct.get(rem).append(i)
    else:
        dct[rem]=[i]
