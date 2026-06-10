lst=[0]*256
left=0
right=0
s="helloworld"
maxx=0

while(right<len(s)):
    c1=s[right]
    c2=ord(c1)
    lst[c2]+=1

    while lst[c2]>1:
        d1=s[left]
        d2=ord(d1)
        lst[d2]-=1
        left+=1

    maxx=max(maxx,right-left+1)
    right+=1
print(maxx)