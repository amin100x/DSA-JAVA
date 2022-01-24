public class IAS {


    public static void main(String[] args) {

         int arr[] = {2,4,6,7,8,5};
System.out.print(IAS(arr,0));

    }
    static boolean IAS(int arr[] , int index)
    {
        if ( index==arr.length-1)
        {
            return true;
        }
        return (arr[index]<arr[index+1]) && IAS(arr,index+1);
    }
}
