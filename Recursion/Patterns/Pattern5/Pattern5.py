def fun(num,ind,lst,saet,target):
    if target<=0:
        return saet
    saet.add(tuple(lst))
    if ind>=len(num):
        return saet
    lst.append(num[ind])
    fun(num,ind+1,lst,saet,target-num[ind])
    lst.pop()
    fun(num,ind+1,lst,saet,target)
    return saet
out=fun([1,2,3,4],0,[],set(),7)
print(out)