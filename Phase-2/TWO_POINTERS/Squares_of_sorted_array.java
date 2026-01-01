Long [] solve(int []a){
  long []ans=new long[a.length];
  int i=0,j=a.length;
  int k=j;
  while(i<=j){
    long leftSquare(ls)=a[i]*a[i];
    long rs=a[j]*a[j];
    if(ls>=rs){
      ans[k--]=ls;
      i++;
    }
    else{
      ans[k--]=rs;
      j--;
    }
  }
  return  ans;
  
}
