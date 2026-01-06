int segmentwithsmallsum(int []arr,int k){
  long sum=0;
  int count=0;
  int s=0;
  for(int e=0;e<arr.length;e++){
    sum+=arr[e];
    while(sum>k&& s<m ){
      sum -= arr[s];
      s++;
    }
    count+=(e-s+1);
  }
  return len;
}
