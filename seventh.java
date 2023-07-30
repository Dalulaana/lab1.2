public class seventh
{
    public static void reverseArray(int[] arr, int start, int end)
    {
        if (start>=end)
        { return; }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr, start+ 1, end- 1);
    }
    public static void main(String[] args)
    {
        int[] numbers={1, 4, 6, 2};
        for (int num:numbers)
        { System.out.print(num + " "); }
        reverseArray(numbers, 0, numbers.length- 1);
        System.out.print("\n");
        for (int num:numbers)
        { System.out.print(num+" "); }
    }
}
