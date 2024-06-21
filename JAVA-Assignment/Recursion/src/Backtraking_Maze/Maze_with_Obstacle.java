package Backtraking_Maze;

public class Maze_with_Obstacle {
    public static void main(String[] args) {
        boolean[][] maze = {{}};

    }

    //    Stopping the Recursion that Point
    static void pathWithRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[r][c] == false) {
            return;
        }

        if (r < maze.length - 1) {
            pathWithRestriction(p + 'D', maze, r+1, c);
        }
        if (c < maze[0].length - 1) {
            pathWithRestriction(p + 'R', maze, r, c + 1);
        }
    }
}
