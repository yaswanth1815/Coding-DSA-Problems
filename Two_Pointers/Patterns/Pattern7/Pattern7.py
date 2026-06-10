def fun(left,right,nums,count,sum,k):
    while(right<len(nums)):
        sum+=nums[right]
        while(sum>k):
            sum-=nums[left]
            left+=1
        count+=(right-left+1)
        right+=1
    return count
nums=[1,0,1,1,1,0]
first=fun(0,0,nums,0,0,2)
second=fun(0,0,nums,0,0,1)
print(first-second)