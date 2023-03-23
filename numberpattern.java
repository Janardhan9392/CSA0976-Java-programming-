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
 for(i=1;i<=r;i++)
{
 for(j=1;j<=i;j++)
  {
   System.out.print(i+" ");
  }
  System.out.println();
  if(i==r)
       break;
 }
   for(i=r-1;i>=1;i--)
  {
   for(j=1;j<=i;j++)
 {
  System.out.print(i+" ");
 }
 System.out.println();
}

}
}

