nums=[1,2,3]
freq=[False]*len(nums)
def function(freq,nums,lst,store):
    if len(nums)==len(lst):
        store.append(list(lst))
        return store
    for i in range(len(nums)):
        if freq[i]==False:
            lst.append(nums[i])
            freq[i]=True
            function(freq,nums,lst,store)
            lst.pop()
            freq[i]=False
    return store

st=function(freq,nums,[],[])
print(st)
