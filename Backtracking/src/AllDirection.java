public class AllDirection {
    public static void main(String[] args) {

        boolean bord[][]=
                {
                        {true,true,true}
                        ,{true,true,true},
                        {true,true,true}
                };
                all("",bord,0,0);
    }

    static void all(String p, boolean[][] maze, int r,int c)
    {
        if (r==maze.length-1 && c==maze[0].length-1 )
        {
            System.out.println(p);
            return;
        }

        if (!maze[r][c])
        {
            return;
        }

        // I am Considering this block is in my Path
        maze[r][c]=false;

        if (r < maze.length-1)
        {
            all(p+'D',maze, r+1, c);
        }
        if (c< maze[0].length-1)
        {
            all(p+'R', maze, r,c+1);
        }
        if (r>0)
        {
            all(p+'U', maze, r-1,c);
        }
        if (c>0)
        {
            all(p+'L', maze, r,c-1);
        }

        //This line is where the function will be over
        //so before the fuction gets removed, also remove the changes that were made by that function

        maze[r][c]=true;
    }
}
