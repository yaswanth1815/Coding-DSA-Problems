import math
from functools import reduce
lst=[1,2,3]
def max_sum_of_adjacent_sequence_numbers_logic1(lst,i,lst1,lst2):
    if i>=len(lst):
        lst2.append(list(lst1))
        return
    lst1.append(lst[i])
    max_sum_of_adjacent_sequence_numbers_logic1(lst,i+2,lst1,lst2)
    lst1.pop(-1)
    max_sum_of_adjacent_sequence_numbers_logic1(lst,i+1,lst1,lst2)
    return lst2
def max_sum_of_adjacent_sequence_numbers_logic2(lst,i,dp):
    if(i==0):
        return lst[0]
    elif(i==-1):
        return 0
    if dp[i]!=-1:
        return dp[i]
    pick=lst[i]+max_sum_of_adjacent_sequence_numbers_logic2(lst,i-2,dp)
    nonpick=0+max_sum_of_adjacent_sequence_numbers_logic2(lst,i-1,dp)
    dp[i]=max(pick,nonpick)
    return dp[i]
ll=max_sum_of_adjacent_sequence_numbers_logic1(lst,0,[],[])
output2=max_sum_of_adjacent_sequence_numbers_logic2(lst,len(lst)-1,[-1]*len(lst))
output1=list(map(lambda x:sum(x),ll))
print(max(output1),output2)