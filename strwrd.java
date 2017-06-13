import java.util.Scanner;
class strwrd
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String[] s2=s1.split(" ");
        int n=s2.length;
        for(int i=0;i<n;i++)
        {
        String ss=new StringBuffer(s2[i]).reverse().toString();
        System.out.print(ss+" ");
        }

    }
}
