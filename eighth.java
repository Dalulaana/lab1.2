public class eighth
{
    public static boolean digits(String s)
    {
        if (s.isEmpty())
        { return true; }
        char first=s.charAt(0);
        if (Character.isDigit(first))
        { return digits(s.substring(1)); }
        else
        { return false; }
    }
    public static void main(String[] args)
    {
        String str1="123456";
        String str2="123a12";
        System.out.println(str1+": "+digits(str1));
        System.out.println(str2+": "+digits(str2));
    }
}
