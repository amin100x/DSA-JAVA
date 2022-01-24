import java.util.ArrayList;

// Return arratlist when it passed as argument
public class ReturnArrayList {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,6};
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println(RAL(arr,4,0,a));
    }

    static ArrayList<Integer>  RAL(int[] arr, int target, int index, ArrayList<Integer> list)
    {
        if (index==arr.length)
        {
            return list;
        }
        if (target==arr[index])
        {
            list.add(index);
        }
        return RAL(arr,target,index+1,list);
    }
}
