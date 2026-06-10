s="abcabcc"
left=0
right=0
check=[0]*3
count=0

while right<len(s):

    a1=s[right]
    a2=ord(a1)-ord('a')
    check[a2]+=1

    while check[0]>0 and check[1]>0 and check[2]>0:
        b1=s[left]
        b2=ord(b1)-ord('a')
        check[b2]-=1
        count=count+len(s)-right
        left+=1
    right+=1
print(count)
