nums=[10,22,45,2,33,46,32]
prefix_sums=[0]*len(nums)
sum=0

for i in range(len(nums)):
    sum+=nums[i]
    prefix_sums[i]=sum
print(prefix_sums)