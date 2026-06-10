lst=[4,4,2,2,2,3,3,3,1,1]
dct={}
for i in lst:
    dct[i]=dct.setdefault(i,0)+1

dct2=dict(sorted(dct.items(),key=lambda x:(-x[1],x[0])))
max=list(dct2.values())
m=max[0]
print(dct2)
for a in dct2.items():
    if a[1]<m:
        print(a[1])
        break