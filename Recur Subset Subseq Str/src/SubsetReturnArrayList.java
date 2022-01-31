import java.util.ArrayList;

public class SubsetReturnArrayList {

    public static void main(String[] args) {

        ArrayList<String> ans= Sub("", "abc");
        System.out.println(ans);
    }
    static ArrayList<String> Sub(String p, String up)
    {
        if (up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=Sub(p+ch, up.substring(1));
        ArrayList<String> right=Sub( p, up.substring(1));
        left.addAll(right);
        return left;

    }
}
