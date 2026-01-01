long A_pow_B_mod_m(long a,long b,long m){
  if(b==0) return 1;
  if(b==1) return a;
  long half = A_pow_B_mod_m(a,b/2,m);
  long sq=(((half%m)*(half%m))%m);
  if(b%2==0) return sq;
  else return (((sq%m)*(a%m))%m);
}
