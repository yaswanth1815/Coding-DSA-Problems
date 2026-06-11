def divide(nums,start,end):
    if start>=end:
        return
    mid=(start+end)//2
    divide(nums,start,mid)
    divide(nums,mid+1,end)
    merge(nums,start,end,mid)

def merge(nums,start,end,mid):
    i=start
    j=mid+1
    k=0
    temp=[0]*(end-start+1)

    while i<=mid and j<=end:
        if nums[i]<=nums[j]:
            temp[k]=nums[i]
            k+=1
            i+=1
        else:
            temp[k]=nums[j]
            k+=1
            j+=1

    while i<=mid:
        temp[k]=nums[i]
        k+=1
        i+=1
    while j<=end:
        temp[k]=nums[j]
        k+=1
        j+=1
    for i in range(len(temp)):
        nums[start+i]=temp[i]

nums=[1000,9,3,10,320,12,22,46]
divide(nums,0,len(nums)-1)
print(nums)