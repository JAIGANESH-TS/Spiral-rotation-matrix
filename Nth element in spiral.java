class Matrix
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	int sr=0,er=n-1;
	int sc=0,ec=m-1;
	int count=0,ele=0;
	while(sr<=er && sc<=ec)
	{
	    for(int i=sc;i<=ec;i++)
	    {
	        count++;
	        if(count==k)
	        return A[sr][i];
	    }
	    sr++;
	    for(int i=sr;i<=er;i++)
	    {
	        count++;
	        if(count==k)
	        return A[i][ec];
	    }
	    ec--;
	    for(int i=ec;i>=sc;i--)
	    {
	        count++;
	        if(count==k)
	        return A[er][i];
	    }
	    er--;
	    for(int i=er;i>=sr;i--)
	    {
	        count++;
	        if(count==k)
	        return A[i][sc];
	    }
	    sc++;
	}return 0;
    }
}