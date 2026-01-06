Lar=fph(root,a);
Lbr=fph(root,b);
i=Lar.size();
j=Lbr.size();
while(i>=0 && j>=0 && Lar.get(i)==Lbr.get(j)){
  i--;
  j--;
}
LCA = Lar.get(i+1) or Lbr.get(j+1);
sum=LCA;
while(i>=0) sum+=Lar.get(i); i--;
while(j>=0) sum+=Lbr.get(j); j--;
return sum;

