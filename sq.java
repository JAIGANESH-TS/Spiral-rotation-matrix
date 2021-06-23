import java.util.*;
public class j
{
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int mat[][]=new int[n][n];
  int cr=n/2;
  int cc=n-1;
  for(int i=1;i<=n*n;)
  {
  if(cr==-1 && cc==n)
  {
    cr=0;cc=n-2;
  }
  else
  {
    if(cr==-1)
    cr=n-1;
    if(cc==n)
    cc=0;
  }
    if(mat[cr][cc]==0)
    {
      mat[cr][cc]=i++;cr--;cc++;
    }
    else
    {
    cr++;cc-=2;continue;
    }
  }
  for(int arr[]:mat)
  System.out.println(Arrays.toString(arr));
}
}
