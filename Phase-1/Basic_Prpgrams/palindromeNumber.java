public static boolean isPalindrome(int 0){
  int num=0;
int r=0;
while(num!=0){
  int d=num%10;
  r=r*10+d;
  num=num/10;
}
return n==r && r>0;
}
