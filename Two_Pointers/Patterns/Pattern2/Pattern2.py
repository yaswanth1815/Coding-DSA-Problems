nums=[2,5,7,1,4,4,3,2,5]
k=10
left=0
right=0
summ=0
maxx=0
while right<len(nums) and right>=left:
    summ+=nums[right];
    while(summ>k):
        summ-=nums[left]
        left+=1
    maxx=max(maxx,right-left+1)
    right+=1
print(maxx)