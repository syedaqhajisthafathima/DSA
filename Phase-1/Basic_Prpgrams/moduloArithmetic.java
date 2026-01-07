public String modulo(long a,long b,long c,long m){
  long x=((((a%m)+(b%m))%m)+(c%m))%m;
  long y=((((a%m)*(b%m))%m)+(c%m))%m;
  return x+" "+y;
}
