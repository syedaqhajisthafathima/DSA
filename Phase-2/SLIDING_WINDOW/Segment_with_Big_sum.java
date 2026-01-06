int segment_with_Big_sum(int arr[],int k){
  int len=Integer.MAXVALUE;
  long sum=0;
  int s=0;
  for(int e=0;e<arr.length;e++){
    sum+=arr[e];
    while(s<n && sum>=k){
      len=Math.min(len,e-s+1);
      sum-=arr[s];
      s++;
    }
  }
  return len;
}
