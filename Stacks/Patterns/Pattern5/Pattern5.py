nums=[1,5,8,78,25,77,3,2,12,20]
cnge_nums=[0]*len(nums)
stk=[]

for i in range(2*len(nums)-1,-1,-1):
    idx=i%len(nums)-1
    while(len(stk) and stk[-1]<=nums[idx]):
        stk.pop()
    if(len(stk)):
        cnge_nums[idx]=stk[-1]
    else:
        cnge_nums[idx]=-1
    stk.append(nums[idx])
print(cnge_nums)