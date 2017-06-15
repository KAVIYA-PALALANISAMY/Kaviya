
  import java.util.Scanner;
class mulstr
{
  public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     String s1=s.nextLine();
     String[] s2=s1.split("");
     long n1=Long.parseLong(s2[0]);
     long n2=Long.parseLong(s2[1]);
   long n3=0;
    if(n1 >0&& n2>0)
     {
      n3=n1*n2;
      }
     System.out.print(Long.toString(n3));
   }
}
