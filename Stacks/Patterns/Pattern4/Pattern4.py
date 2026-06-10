stk=[]
lst=[1,5,2,11,6,4,5,11,10,100]
pse_lst=[0]*len(lst)

for i in range(0,len(lst)):
    while(len(stk)>0 and stk[-1]>=lst[i]):
        stk.pop()
    if len(stk)==0:
        pse_lst[i]=-1  
    else:
        pse_lst[i]=stk[-1]
    stk.append(lst[i])
print(pse_lst)