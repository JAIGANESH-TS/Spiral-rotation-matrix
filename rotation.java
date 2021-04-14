class Solution {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int ans[][]=new int[R*C][2];
        int count=0;
        int dx=0;int dy=1;
        int n=0;int x=r0,y=c0;
        for(;count<R*C;)
        {
            for(int  j=0;j<=n/2;j++)
            {
                if(x>=0 && x<R && y>=0 && y<C)
                    ans[count++]=new int[]{x,y};
                x+=dx;y+=dy;
            }
            int t=dx;
            dx=dy;
            dy=-t;
            n++;
        }
        return ans;
    }
}