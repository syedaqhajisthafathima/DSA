//(A*B) % m = 1 <=> B=((1/A)%m) <=> (([A] pow -1)%m)
// mod= 10 pow 9 + 7 
for(i -> 1:m){
  if(((A*i)%m)==1) return i;// this means modulo_inverse possible
}
return modulo_inverse not possible

TC : O(modulo) // when test cases are less and m<= 10 pow 8

if m > 10 pow  8 we get TLE

we need to use Fermat little's Theorem:
  -> GCD(A,M) = 1
  -> M must be a prime number
  -> B = ( A pow m-2) % m;
  ( A pow m-2) % m replaced by binExp(A,m-2,m)
TC: log(b) base 2 => log(m-2) base 2
