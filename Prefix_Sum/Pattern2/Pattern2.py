nums=[10,22,45,2,33,46,32,33,55,21,345,98]
prefix_sums=[0]*len(nums)
sum=0
start=2
end=6
for i in range(end+1):
    sum+=nums[i]
    if i>=start:
        print(sum,end=",")