nums=[1,0,-1,4,2,-2,-4]
dict={}
dict[0]=[-1]
sum=0

for i in range(len(nums)):
    sum+=nums[i]

    if dict.get(sum):
        lst=dict.get(sum)
        for k in lst:
            print(nums[k+1:i+1])
        lst.append(i)
    else:
        dict[sum]=[i]
