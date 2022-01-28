public class RemoveA {

    public static void main(String[] args) {


      removeA("", "abbsbb");

    }

    static void removeA(String s, String sp)
    {
        if (sp.isEmpty())
        {
            System.out.println(s);
            return;
        }
        char c=sp.charAt(0);
        if (c=='a')
        {
            removeA(s,sp.substring(1));
        }
        else {
            removeA(s+c, sp.substring(1));
        }
    }
}
