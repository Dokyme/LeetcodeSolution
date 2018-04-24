/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int total=0;
        Employee[] emps=new Employee[2000];
        for(Employee e:employees){
            emps[e.id]=e;
        }
        Queue<Employee> queue=new LinkedList();
        queue.offer(emps[id]);
        while(!queue.isEmpty()){
            Employee current=queue.poll();
            total+=current.importance;
            for(Integer subid:current.subordinates){
                queue.offer(emps[subid]);
            }
        }
        return total;
    }
}