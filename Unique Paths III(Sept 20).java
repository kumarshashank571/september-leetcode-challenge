class Solution {
    static int[][] dir = {{1,0},{0,1},{0,-1},{-1,0}};
    public static int floodfill(int sr,int sc,int[][] arr,int freecell){
        if(freecell==1){
           return arr[sr][sc]==2 ? 1 : 0;
        }
        int count = 0;
        int temp = arr[sr][sc];
        arr[sr][sc] = -1;
        for(int d=0;d<4;d++){
            int r = sr+dir[d][0];
            int c = sc+dir[d][1];
            if(r>=0 && c>=0 && r<arr.length && c<arr[0].length && arr[r][c]>=0){
        count += floodfill(r,c,arr,freecell-1);
            }
        }
        arr[sr][sc] = temp;
        return count;
    }
        
    public int uniquePathsIII(int[][] arr) {
        int sc = 0;
        int sr = 0;
         int count = 0;
     for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[0].length;j++){
             if(arr[i][j]!=-1){
                 count++;
             }
             if(arr[i][j]==1){
                 sr = i;
                 sc = j;
             }
         }
     }   
        return floodfill(sr,sc,arr,count);
    }
}
