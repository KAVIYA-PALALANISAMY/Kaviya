import java.io.*;
import java.util.*;
class anagram
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      String s2=s.nextLine();
      int al=s1.length();
     int bl=s2.length();
     int f=0;
         int aa[]=new int[26];
         for(int i=0;i<al;i++)
         {
             if(Character.isLetter(s1.charAt(i)))
             aa[(int)s1.charAt(i)-97]++;
         }
         int bb[]=new int[26];
          for(int j=0;j<bl;j++)
          {
              if(Character.isLetter(s2.charAt(j)))
                bb[(int)s2.charAt(j)-97]++;
                
             
          }
          for(int i=0;i<26;i++)
          if(aa[i]!=bb[i])
          {
              f=1;
              break;
          }
          if(f==1)
          {
          System.out.print("False");
          }
          else
          {
             System.out.print("True");
          }
      
    
     
    }
}
