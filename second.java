public class second
{
    public static double average(int n, int[] arr)
    {
        double sum=0;
        for (int i=0; i<n; i++)
        {
            sum+=arr[i];
        }
        return sum/n;
    }
    public static void main(String[] args)
    {
        int[] numbers = {3, 2, 4, 1};
        double average = average(numbers.length, numbers);
        System.out.println("average: " + average);
    }
}
