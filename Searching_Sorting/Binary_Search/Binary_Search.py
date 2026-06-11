def binary_search(lst,low,high,target):
    if(low>high):
        return False
    mid=(low+high)//2

    if lst[mid]>target:
        return binary_search(lst,low,mid-1,target)
    elif lst[mid]<target:
        return binary_search(lst,mid+1,high,target)
    elif lst[mid]==target:
        return True
    return False

lst=[2,4,1,55,3,22,14,25,100]
check=binary_search(lst,0,len(lst)-1,212)
print(check)