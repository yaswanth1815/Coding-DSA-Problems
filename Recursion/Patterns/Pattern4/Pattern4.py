def fun(k,nums,lst1,lst2,ind):
    if ind==len(nums):
        if len(lst1)==k:
            lst2.append(list(lst1))
        return lst2
    lst1.append(nums[ind])
    fun(k,nums,lst1,lst2,ind+1)
    lst1.pop()
    fun(k,nums,lst1,lst2,ind+1)
    return lst2

a=fun(3,[1,2,3,4],[],[],0)
print(a)
