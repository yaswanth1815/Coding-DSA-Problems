stk=[]
lst=[1,5,2,11,6,4,5,11,10,100]
nge_lst=[0]*len(lst)

for i in range(len(lst)-1,-1,-1):
    while(len(stk)>0 and stk[-1]<=lst[i]):
        stk.pop()
    if len(stk)==0:
        nge_lst[i]=-1  
    else:
        nge_lst[i]=stk[-1]
    stk.append(lst[i])
print(nge_lst)