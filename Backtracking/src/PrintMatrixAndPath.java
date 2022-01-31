import java.util.Arrays;

public class PrintMatrixAndPath {

    public static void main(String[] args) {

        boolean bord[][]=
                {
                        {true,true,true}
                        ,{true,true,true},
                        {true,true,true}
                };
        int [][]p=new int[bord.length][bord[0].length];
        allmatrixP("", bord, 0,0,p,1);
    }

    static void allmatrixP(String p, boolean[][] maze, int r, int c,int[][] path, int step)
    {
            if (r==maze.length-1 && c==maze[0].length-1)
            {
                path[r][c]=step;
                for(int[] arr:path)
                {
                    System.out.println(Arrays.toString(arr));
                }
                System.out.println(p);
                System.out.println();
                return;
            }
        if (!maze[r][c])
        {
            return;
        }


        maze[r][c]=false;
            path[r][c]=step;

        if (r < maze.length-1)
        {
            allmatrixP(p+'D',maze, r+1, c, path,step+1);
        }
        if (c< maze[0].length-1)
        {
            allmatrixP(p+'R', maze, r,c+1, path, step+1);
        }
        if (r>0)
        {
            allmatrixP(p+'U', maze, r-1,c, path, step+1);
        }
        if (c>0)
        {
            allmatrixP(p+'L', maze, r,c-1, path, step+1);
        }


    }
}
