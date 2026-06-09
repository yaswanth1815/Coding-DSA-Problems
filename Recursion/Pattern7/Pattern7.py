def fun(num,target,lst1,lst2,ind):
    if target<=0:
        if target==0:
            lst2.append(list(lst1))
        return lst2
    if ind==len(num):
        return lst2
    lst1.append(num[ind])
    fun(num,target-num[ind],lst1,lst2,ind)
    lst1.pop()
    fun(num,target,lst1,lst2,ind+1)
    return lst2
out=fun([1,2,3],7,[],[],0)
print(out)