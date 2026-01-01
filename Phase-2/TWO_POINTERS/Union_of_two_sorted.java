while(i<al && j<bl){
  if(a[i]<b[j]){
    //add a[i] by checking duplicates in ans array
    if(ans.size()==0 || !ans.get(ans.size()-1).equals(a[i])){ //handling duplicates
          ans.add(a[i]);
    }
    i++;
  }
  else{
    //add b[j] by checking duplicates in ans array
    if(ans.size()==0 || !ans.get(ans.size()-1).equals(b[j])){ //handling duplicates
          ans.add(b[j]);
    }
    j++;
  }
}

while(i< al){
  if(ans.size()==0 || !ans.get(ans.size()-1).equals(a[i])){ //handling duplicates
          ans.add(a[i]);
    }
    i++;
}
while(j<bl){
  if(ans.size()==0 || !ans.get(ans.size()-1).equals(b[j])){ //handling duplicates
          ans.add(b[j]);
    }
    j++;
}
