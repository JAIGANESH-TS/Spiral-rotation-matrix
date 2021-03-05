/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try
		{
		    Scanner in=new Scanner(System.in);
		    int n=in.nextInt();
		    String dir=in.next();
		    int mat[][]=new int[n][n];
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            mat[i][j]=in.nextInt();
		        }
		    }
		    int dp[][]=new int[n][n];
		    if(dir.equals("CW"))
		    {
		        int sr=0,sc=0,er=n-1,ec=n-1;
		        while(sr<er)
		        {
		            ArrayList<Integer> al=new ArrayList<>();
		            for(int i=sr;i<=er;i++)
		            al.add(mat[i][sc]);
		            for(int i=sc+1;i<=ec;i++)
		            al.add(mat[er][i]);
		            for(int i=er-1;i>=sr;i--)
		            al.add(mat[i][ec]);
		            for(int i=ec-1;i>sc;i--)
		            al.add(mat[sr][i]);
		            int ind=0;
		            int t=al.get(0);
		            al.remove(0);
		            al.add(t);
		            for(int i=sr;i<=er;i++)
		            mat[i][sc]=al.get(ind++);
		            for(int i=sc+1;i<=ec;i++)
		            mat[er][i]=al.get(ind++);
		            for(int i=er-1;i>=sr;i--)
		            mat[i][ec]=al.get(ind++);
		            for(int i=ec-1;i>sc;i--)
		            mat[sr][i]=al.get(ind++);
		            sc++;ec--;
		            sr++;
		            er--;
		           // System.out.println(al);
		        }
		    }
		    else
		    {
		    int sr=0,sc=0,er=n-1,ec=n-1;
		    while(sr<er)
		    {
		        ArrayList<Integer> al=new ArrayList<>();
		        for(int i=sc;i<=ec;i++)
		        al.add(mat[sr][i]);
		        for(int i=sr+1;i<=er;i++)
		        al.add(mat[i][ec]);
		        for(int i=ec-1;i>=sc;i--)
		        al.add(mat[er][i]);
		        for(int i=er-1;i>sr;i--)
		        al.add(mat[i][sc]);
		        //System.out.println(al);
		         int ind=0;
		            int t=al.get(0);
		            al.remove(0);
		            al.add(t);
		             for(int i=sc;i<=ec;i++)
		        al.add(mat[sr][i]);
		        for(int i=sc;i<=ec;i++)
		        mat[sr][i]=al.get(ind++);
		        for(int i=sr+1;i<=er;i++)
		        mat[i][ec]=al.get(ind++);
		        for(int i=ec-1;i>=sc;i--)
		        mat[er][i]=al.get(ind++);
		        for(int i=er-1;i>sr;i--)
		        mat[i][sc]=al.get(ind++);
		         sc++;ec--;
		         sr++;er--;
		        
		    }
		    }
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        System.out.print(mat[i][j]+" ");
		        System.out.println();
		    }
		}
		catch(Exception e)
		{
		    
		}
	}
}
