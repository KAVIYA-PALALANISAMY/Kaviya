import java.util.*;
class charoccr
{
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      String s1=s.next();
      int len=s1.length();
      int a[]=new int[26];
       for(int i=0;i<len;i++)
        {
           a[(int)s1.charAt(i)-97]++;
         }
       for(int i=0;i<len;i++)
        {
          if(a[(int)s1.charAt(i)-97]==1)
           {
              System.out.print(s1.charAt(i));
            }
         }
     }
}