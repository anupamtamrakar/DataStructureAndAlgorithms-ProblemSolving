// Largest square formed in a matrix

//Given a binary matrix, find out the maximum size square sub-matrix with all 1s.


import java.lang.*;
class MaxRect{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] a=new int[50][50];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		GfG g=new GfG();
		
		System.out.println(g.maxArea(a,m,n));
	}
}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function given below*/
class Test {
    public int maxArea(int a[][],int m,int n){
        int s[][] = new int[m][n];
        int max=0;
        for(int i =0; i<n;i++)
            s[0][i] = a[0][i];
        for(int j = 0; j<m;j++)
            s[j][0] = a[j][0];
        
        for(int x =1;x<m;x++){
            for(int y=1;y<n;y++){
                if(a[x][y] == 1)
                    s[x][y] = 1+ Math.min(Math.min(s[x-1][y],s[x][y-1]),s[x-1][y-1]);
                else
                    s[x][y] = 0;
            }
        }
      
      for(int x =0;x<m;x++){
            for(int y=0;y<n;y++){
                if(s[x][y] > max)
                    max = s[x][y];
            }
      }
        return max;
    }
}