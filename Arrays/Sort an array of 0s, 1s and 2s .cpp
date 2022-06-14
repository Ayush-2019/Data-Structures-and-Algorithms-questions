void sort012(int a[], int n)
{
    int zero=0,one=0,two=0;
    for(int i=0;i<n;i++){
        if(a[i]==0){
            zero+=1;
        }
        else if(a[i]==1){
            one+=1;
        }
        else if(a[i]==2){
            two+=1;
        }
    }
    for(int j=0;j<=zero-1;j++){
        a[j]=0;
    }
    for(int k=zero;k<=zero+one-1;k++){
        a[k]=1;
    }
    for(int l=zero+one;l<=n-1;l++){
        a[l]=2;
    }
}
