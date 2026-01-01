//for A-B
while(i<al && j<bl){
  if(a[i]==b[j]){
    i++;
    j++;
  }
  else if(a[i]<b[j]){
    //add a[i];
    i++;
  }
  else j++;
}
while(i<al){
  //add a[i];
  i++;
}
return ans;
