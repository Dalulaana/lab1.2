public class thefirst
{
    public static int findMin(int[] arr)
    {
        int min=arr[0];
        for (int i=1; i<arr.length; i++)
        {   if (arr[i]<min)
            {   min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        int[] numbers={10, 1, 32, 3, 45};
        int minimum=findMin(numbers);
        System.out.println("minimum: "+minimum);
    }
}
