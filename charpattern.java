import java.io.*;
import java.util.*;
class pattern1
{
 public static void main(String args[])
{
 int r,i,j;
 String ch;
 Scanner s=new Scanner(System.in);
 System.out.print("enter the character");
 ch=s.nextLine();
 System.out.print("enter the row");
 r=s.nextInt();
 
 for(i=1;i<=r;i++)
{
 for(j=1;j<=i;j++)
  {
   System.out.print(ch+" ");
  }
  System.out.println();
}
}
}