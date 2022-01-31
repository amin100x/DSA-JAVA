public class SkipString {

    public static void main(String[] args) {

        System.out.println(skipper("appleerfdgbapple"));
    }

    static String skipper(String s)
    {
        if (s.isEmpty())
        {
            return "";
        }
        if (s.startsWith("apple"))
        {
            return  skipper(s.substring(5));
        }
        else
        {
            return s.charAt(0) +skipper(s.substring(1));
        }

    }
}
