public class MazeCount {

    public static void main(String[] args) {

        System.out.println(count(3,3));
    }

    static int count(int r,int c)
    {
        if (r==1 || c==1)
        {
            return 1;
        }
        int l= count(r-1,c);
        int ri=count(r,c-1);
        return l+ri;
    }
}
