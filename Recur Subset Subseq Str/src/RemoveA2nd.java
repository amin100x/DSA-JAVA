public class RemoveA2nd {

    public static void main(String[] args) {

        String s="bvdffaa";
        System.out.println(remA(s));
    }

    static String remA(String s)
    {
        if (s.isEmpty())
        {
            return "";
        }
        char c=s.charAt(0);
        if (c=='a')
        {
           return remA(s.substring(1));
        }
        else
        {
           return c+remA(s.substring(1));
        }

    }


}
