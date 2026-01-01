boolean isPal(int a[],int n){
  return helper(a,0,n);
}
boolean helper(int []a,int i,int j){
  if(i>=j) return true;
  if(a[i]!=a[j]) return false;
  return helper(a,i+1,j-1);
}
