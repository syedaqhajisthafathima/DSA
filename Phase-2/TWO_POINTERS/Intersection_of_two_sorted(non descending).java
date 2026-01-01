List<Integer>intersection(List a,List b){
  int al=a.size();
  int bl=b.size();
  List<Integer>ans =new ArrayList<>();
  int i=0,j=0;
  while(i<al && j<bl){
    if(a[i]==b[j]){
      if(a.get(i).equals(b.get(i))){
        if(ans.size()==0 || !ans.get(ans.size()-1).equals(a.get(i))){ //handling duplicates
          ans.add(a.get(i));
        }
        i++;
        j++;
      }
      else if(a.get(i)<b.get(j))i++;
      else j++;
    }
  }
  return ans;
}
