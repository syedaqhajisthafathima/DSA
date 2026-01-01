//Given two sorted arrays a,b of non descending elemnts count total number of pairs where a[i]=b[j]
Long solve(int []a,int b[]){
  int al=a.length;
  int bl=b.length;
  int i=0,j=0;
  long count=0;
  while(i<al && j<bl){
    if(a[i]==b[j]){
      long c1=0;
      long c2=0;
      int key=a[i];// or key=b[j] since a[i]=b[j]
      while(a[i]==key && i<al){
        c1++;
        i++;
      }
      while(j<bl && b[j]==key){
        c2++;
        j++;
      }
      count+=c1*c2;
    }
    else if(a[i]<b[j]){
      i++;
    }
    else{
      j++;
    }
  }
  return count;
}
