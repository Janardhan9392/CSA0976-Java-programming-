import java.io.*;
import java.util.*;
class pattern
{
 public static void main(String args[])
{
 int r,c,i,j;
 Scanner s=new Scanner(System.in);
 System.out.println("enter the row");
 r=s.nextInt();
 System.out.println("enter the column");
 c=s.nextInt();
 for(i=1;i<=r;i++)
 {
  for(j=1;j<=c;j++)
  {
   System.out.print("*");
  }
  System.out.println();
}
}
}
