int doUnion(int a[], int n, int b[], int m)  {
    int hash[1000000]={0*1000000};
    for(int i=0;i<n;i++){
        if(hash[a[i]]==0){
            hash[a[i]]+=1;
        }
    }
    for(int i=0;i<m;i++){
        if(hash[b[i]]==0){
            hash[b[i]]+=1;
        }
    }
    int result=0;
    for(int i=0;i<1000000;i++){
        result+=hash[i];
    }
    return result;
}
