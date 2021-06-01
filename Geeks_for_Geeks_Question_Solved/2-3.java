class Solution 
{ 
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	  int i,j;
	  for(i=0;i<n;i++)
	  {
	      for(j=0;j<m;j++)
	      {
	          if(matrix[i][j]==x)
	            return true;
	      }
	  }
	  return false;
	} 
}
