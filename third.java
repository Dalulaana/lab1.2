public class third
{
    public static boolean prime(int n)
    {
        if (n<=1)
        { return false; }
        if (n==2)
        { return true; }
        if (n%2==0)
        { return false; }
        for (int i=3; i*i<=n; i+=2)
        {
            if (n%i==0)
            { return false; }
        }
        return true;
    }
    public static void main(String[] args)
    { int number=7;
        boolean primenumber=prime(number);
        if (primenumber)
        { System.out.println(number+" is prime"); }
        else
        { System.out.println(number+" is composite"); }
    }
}
