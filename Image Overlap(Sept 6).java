class Solution {
    public int shiftcount(int[][] a,int[][] b){
        int n = a.length;
        int count = 0;
        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                int temp = 0;
                for(int i=y;i<n;i++){
                    for(int j=x;j<n;j++){
                        if(a[i][j]==1 && b[i-y][j-x]==1){
                            temp++;
                        }
                    }
                }
                count = Math.max(temp,count);
            }
        }
        return count;
    }
    
    public int largestOverlap(int[][] a, int[][] b) {
        return Math.max(shiftcount(a,b),shiftcount(b,a));
    }
}
