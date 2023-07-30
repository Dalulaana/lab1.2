public class nineth
{
    public static int bicoef(int n, int k)
    {
        int[][] memo=new int[n + 1][k + 1];
        return calculateBiCoef(n, k, memo);
    }
    public static int calculateBiCoef(int n, int k, int[][] memo)
    {
        if (k==0||k==n)
        { return 1; }
        if (memo[n][k]!=0)
        { return memo[n][k]; }
        int coefficient=calculateBiCoef(n - 1, k - 1, memo)+calculateBiCoef(n - 1, k, memo);
        memo[n][k] = coefficient;
        return coefficient;
    }
    public static void main(String[] args)
    {
        int n=7;
        int k=3;
        int result=bicoef(n, k);
        System.out.println(n+" "+k+"  "+result);
    }
}
