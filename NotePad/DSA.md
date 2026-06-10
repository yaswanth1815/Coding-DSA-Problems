# \----------------------Recursion-----------------------------

#### **1.Generating all subsequences**



Ex:\[1,2,3]



output:



\[\[1],\[1,2],\[1,2,3],\[1,3],\[2,3],\[2],\[3]]



Java Code:



import java.util.\*;

class Practice{

&#x20;   public static void main(String\[] args) {

&#x20;       List<List<Integer>> ls=new ArrayList<>();

&#x20;       ls=fun(new int\[]{1,2,3,4},0,new ArrayList<>(),new ArrayList<>());

&#x20;       System.out.println(ls);

&#x20;   }

&#x20;   public static List<List<Integer>> fun(int\[] num,int i, List<Integer> lst,List<List<Integer>> store){

&#x20;       if(i==num.length){

&#x20;           if(lst.size()>0){

&#x20;               store.add(new ArrayList<>(lst));

&#x20;           }

&#x20;           return store;

&#x20;       }

&#x20;       lst.add(num\[i]);

&#x20;       fun(num,i+1,lst,store);

&#x20;       lst.remove(lst.size()-1);

&#x20;       fun(num,i+1,lst,store);

&#x20;       return store;

&#x20;   }

}





#### **2.Rearrange all elements in given array**



Ex:

\[1,2,3]



output:



\[\[1,2,3],\[1,3,2],\[2,3,1],\[3,1,2],\[3,2,1]]

#### 

