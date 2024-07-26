package Backtracking_MazeProblem;

public class including_all_path {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathObstacleAllPath("",board,0,0);



    }

    static void pathObstacleAllPath(String p,boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;

        }

//        is block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            pathObstacleAllPath(p + 'D',maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathObstacleAllPath(p + 'R',maze, r, c + 1);
        }

        if (r > 0) {
            pathObstacleAllPath(p + 'U',maze, r-1, c);
        }

        if (c > 0) {
            pathObstacleAllPath(p + 'L',maze, r, c - 1);
        }

//        returning or over function
        maze[r][c] = true;

    }
}
