// Max rectangle

/*
Given a binary matrix, Your task is to complete the function maxArea which the maximum size rectangle area in a binary-sub-matrix with all 1’s. The function takes 3 arguments the first argument is the Matrix M[ ] [ ] and the next two are two  integers n and m which denotes the size of the matrix M. Your function should return an integer denoting the area of the maximum rectangle .

*/

class Test {
    public int maxArea(int a[][],int m,int n){
      int arr[] = new int[n];
        int curr,next;
        int val;
        int max =0;
        for(int row = 0;row<m;row++){
            if(row==0){
                for(int i=0;i<n;i++)
                    arr[i] =a[0][i];
            }
            else {
                for(int i=0;i<n;i++){
                    if(a[row][i] == 0)
                        arr[i] = 0;
                    else
                        arr[i] =a[row][i] + arr[i];
                }
            }
            
            
            val = hist(arr,n);
            if(val>max)
                max =val;
        }
        return max;
    }
    
    public static int hist(int arr[],int size){
        int max = 0;
		    
		    for(int j=0; j<size;j++){
		        int i=j;
		        int k=j;
		        int rec;
		        while(i>=0 && arr[j]<= arr[i])
		            i--;
		        while(k<=size-1 && arr[j]<=arr[k])
		            k++;
		        
		        rec = arr[j] * (k-i-1);
		        if(rec >= max)
		            max = rec;
		        
		    }
		    return max;
    }
}