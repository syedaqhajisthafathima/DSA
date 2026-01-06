String str;
Map<Char,Int>m
int len=0;
int s=0;
for(int e=0;e<n;e++){
  char ce=str.charAt(e);
  m.put(ce,1+m.getOrDefault(ce,0));
  while(m.size()>k){
    char cs=str.charAt(s);
    m.put(cs,m.get(cs)-1);
    if(m.get(cs)==0) m.remove(cs);
    s++;
  }
  len=Math.max(len,e-s+1);
}
return len;

***** exactly k =atmost(k) - atmost(k-1)
