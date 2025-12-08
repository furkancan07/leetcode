/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
   /* public int getImportance(List<Employee> employees, int id) {
       int result=0;
       for(Employee emp : employees){
          if(id==emp.id){
            result+=emp.importance;
            
                for(int i : emp.subordinates){
                    result+=getImportance(employees,i);
                }
            
          }
       }
       return result;
    }*/
    Map<Integer,Employee> map=new HashMap<>();
     public int getImportance(List<Employee> employees, int id) {
        
        for(Employee emp : employees){
            map.put(emp.id,emp);
        }
        return dfs(id);
     }
     public int dfs(int id){
        Employee emp=map.get(id);
        int total=0;
        total+=emp.importance;
        for(int i : emp.subordinates){
            total+=dfs(i);
        }
        return total;
     }
}