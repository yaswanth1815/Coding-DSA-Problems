def fun(nums,lst1,lst2,ind):
    if ind==len(nums):
        lst2.append(list(lst1))
        return lst2
    lst1.append(nums[ind])
    fun(nums,lst1,lst2,ind+1)
    lst1.pop()
    fun(nums,lst1,lst2,ind+1)
    return lst2

a=fun([1,2,3],[],[],0)
print(a)
