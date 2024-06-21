package Backtraking_Maze;

import java.util.ArrayList;

import static Backtraking_Maze.count_Path.pathRet;

public class Diagonal_Path {
    public static void main(String[] args) {
        System.out.println(pathDiagonal("",3,3));

    }
    static ArrayList<String> pathDiagonal(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c > 1) {
            list.addAll(pathDiagonal(p+'D',r-1,c-1));
        }

        if( r > 1) {
            list.addAll(pathDiagonal(p+'V',r-1,c));
        }
        if (c > 1) {
            list.addAll(pathDiagonal(p+'H',r,c-1));
        }

        return list;
    }
}
