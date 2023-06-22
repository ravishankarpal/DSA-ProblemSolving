class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int xCordDiff =  coordinates[1][0] - coordinates[0][0];
        int yCordDiff = coordinates[1][1] - coordinates[0][1];

        for(int i = 1; i< coordinates.length;i++){
            int x1CordDiff = coordinates[i][0] - coordinates[i-1][0];
            int y1CordDiff = coordinates[i][1] - coordinates[i-1][1];
            
            if(yCordDiff * x1CordDiff != y1CordDiff * xCordDiff){
                return false;
            }
            

        }
        return true;
        
    }
}