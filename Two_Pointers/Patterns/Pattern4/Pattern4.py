s="helloworld"
dct={}
left=0
right=0
maxx=0

while right<len(s):
    c=s[right]
    dct[c]=dct.setdefault(c,0)+1
    while dct[c]>1:
        d=s[left]
        dct[d]=dct.get(d)-1
        left+=1
    maxx=max(maxx,right-left+1)
    right+=1
print(maxx)