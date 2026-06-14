target = 7
nums = [2,3,1,2,4,3,7,9]
left=0
right=0
summ=0
minm=123456789

while right<len(nums) and right>=left:
    summ+=nums[right]
    while summ>=target:
        minm=min(minm,right-left+1)
        summ-=nums[left]
        left+=1
    right+=1
print(minm)
