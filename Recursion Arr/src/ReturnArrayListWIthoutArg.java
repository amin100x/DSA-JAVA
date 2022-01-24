import java.util.ArrayList;

// Return ArrayList Without PAssing Arraylist as argument
public class ReturnArrayListWIthoutArg {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,5,6,7};
System.out.println(RALWA(arr,4,0));
    }

    static ArrayList<Integer> RALWA(int arr[], int target, int index)
    {
        ArrayList<Integer> list= new ArrayList<>();
        if (index==arr.length)
        {
            return list;
        }
        if (target==arr[index])
        {
            list.add(index);
        }
        ArrayList<Integer> ansofBeloveCalls = RALWA(arr, target, index+1);

        list.addAll(ansofBeloveCalls);
        return  list;
    }
}
