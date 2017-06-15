import java.util.Scanner;
class mulstr
{
  public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     String s1=s.nextLine();
     String[] s2=s1.split("");
     int n1=Integer.parseInt(s2[0]);
     int n2=Integer.parseInt(s2[1]);
      int n3=n1*n2;
     System.out.print(Integer.toString(n3));
   }
}

  