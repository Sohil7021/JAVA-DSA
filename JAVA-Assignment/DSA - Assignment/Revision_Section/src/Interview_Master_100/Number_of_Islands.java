package Interview_Master_100;

public class Number_of_Islands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        int ans = island(grid);
        System.out.println(ans);

    }
    static int island(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;

        }
        int numIsland = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                if (grid[i][j] == '1') {
                    numIsland++;
                    dfs(grid,i,j);
                }
            }
        }
        return numIsland;

    }
    static void dfs(char[][] grid, int i, int j) {
        int row = grid.length;
        int col = grid[0].length;

        if (i < 0 || i>= row || j < 0 || j>= col || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);

    }
}
