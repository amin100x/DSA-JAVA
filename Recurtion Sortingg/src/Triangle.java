public class Triangle {

    /*   ****
         ***
         **
         *
     */
    public static void main(String[] args) {

        Tri(5,0);
    }

    static void Tri(int r,int c)
    {
        if (r==0)
        {
            return;
        }
        if (r>c)
        {
            System.out.print("*");
            Tri(r,c+1);
        }

         else {
             System.out.println();
             Tri(r-1, 0);
        }


    }
}
