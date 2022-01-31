public class DiceSum {
    public static void main(String[] args) {

        dice("", 4);
    }

    static void dice(String s, int target)
    {
        if (target==0)
        {
            System.out.println(s);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {

            dice(s+i, target-i );
        }
    }
}
