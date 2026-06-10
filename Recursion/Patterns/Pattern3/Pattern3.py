def fun(start,end,string,lst):
    if start==len(string):
        return lst
    if end==len(string):
        return fun(start+1,start+1,string,lst)
    ss=string[start:end+1]
    lst.append(ss)
    fun(start,end+1,string,lst)
    return lst

out=fun(0,0,"hell",[])
print(out)