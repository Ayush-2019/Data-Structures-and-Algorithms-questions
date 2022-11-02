class Solution {
  public:
    vector<vector<int>> sortedMatrix(int N, vector<vector<int>> Mat) {
        // code here
int arranged[N*N],k=0;
for(int i=0;i<N;i++){
    for(int j=0;j<N;j++){
        arranged[k]=Mat[i][j];
        k++;
    }
}
sort(arranged,arranged+(N*N));
k=0;
for(int i=0;i<N;i++){
    for(int j=0;j<N;j++){
        Mat[i][j]=arranged[k];
        k++;
    }
}
return Mat;
    }
};
