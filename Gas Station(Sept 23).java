class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // o(n^2) aproach
     // int n = gas.length;
     //    for(int i=0;i<n;i++){
     //        int total = 0;
     //        int stopcount = 0;
     //        int j = i;
     //        while(stopcount<n){
     //            total += gas[j%n]-cost[j%n];
     //            if(total<0){
     //                break;
     //            }
     //            stopcount++;
     //            j++;
     //        }
     //        if(stopcount==n && total>=0){
     //            return i;
     //        }
     //    }
     //    return -1;
        
        // o(n) approach
        
        int total = 0;
        int tank = 0;
        int index = 0;
        for(int i=0;i<gas.length;i++){
            int consume = gas[i]-cost[i];
            tank += consume;
            if(tank<0){
                index = i+1;
                tank = 0;
            }
     total += consume;
        }
        return total<0 ? -1 :index;
    } 
}
