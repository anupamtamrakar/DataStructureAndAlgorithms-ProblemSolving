// Find triplets with zero sum


bool findTriplets(int a[], int n)
{ 
    for (int i=0;i<n;i++){
        for(int j = i+1; j<n;j++){
            for(int k = j+1; k <n;k++){
                if(a[i] + a[j] + a[k] == 0){
                    return true;
                }
                    
            }
        }
    }
    return false;
}