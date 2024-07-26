package Backtracking_MazeProblem;

import java.util.Arrays;

public class matrix_Path {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        pathObstacleAllPath("",board,0,0,path,1);

    }

    static void pathObstacleAllPath(String p, boolean[][] maze, int r, int c,int[][] path,int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
           for(int[] arr : path) {
               System.out.println(Arrays.toString(arr));
           }
            return;
        }
        if (!maze[r][c]) {
            return;

        }

//        is block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            pathObstacleAllPath(p + 'D', maze, r + 1, c,path,step+1);
        }

        if (c < maze[0].length - 1) {
            pathObstacleAllPath(p + 'R', maze, r, c + 1,path,step+1);
        }

        if (r > 0) {
            pathObstacleAllPath(p + 'U', maze, r - 1, c,path,step+1);
        }

        if (c > 0) {
            pathObstacleAllPath(p + 'L', maze, r, c - 1,path,step+1);
        }

//        returning or over function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
