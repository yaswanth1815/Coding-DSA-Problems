left=0
right=0
maxx=0
maxfreq=0
s="aaabbs"
dct={}
k=2
while right<len(s) and right>=left:
    c=s[right]
    dct[c]=dct.setdefault(c,0)+1
    maxfreq=max(dct.values())
    while ((right-left+1)-maxfreq)>k:
        d=s[left]
        dct[d]=dct.get(d)-1
        left+=1
        if dct.get(d)==0:
            del dct[d]
    maxx=max(maxx,right-left+1)
    right+=1
print(maxx)