int segment_with_Big_sum(int arr[],int k){
  int count=0;
  long sum=0;
  int s=0;
  int n=arr.length;
  for(int e=0;e<arr.length;e++){
    sum+=arr[e];
    while(s<n && sum>=k){
      count=n-e;
      sum-=arr[s];
      s++;
    }
  }
  return len;
}
