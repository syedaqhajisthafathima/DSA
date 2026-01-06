String micky(r){
  if(r==null) return "";
  List<Node> lmr;
  List<Node> lcr;
  fph(r,"micky",lmr);
  fph(r,"cheese",lcr);
  while(i>=0 && j>=0){
    i--;
    j--;
  }
  =>attach (i+1) 4's
  while(j>=0){
    if(lcr.get(j+1).left==lcr.get(i)){
      attach => L;
    }
    else attach => R;
    j--;
  }
}
