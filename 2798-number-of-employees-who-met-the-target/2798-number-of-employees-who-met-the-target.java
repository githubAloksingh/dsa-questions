class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int employeeHrs : hours){
            if(employeeHrs>=target){
                count++;
            }
        }
        return count;
        
    }
}