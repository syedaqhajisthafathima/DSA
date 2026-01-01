top1=-1,top2=n;
int push(int ele,int st){ // st is to check whether stack 1 or 2
  if(st==1){
    //add in stk1
    if(top1==n-1 || top1+1==top2){
      return false;
    }
    arr[++top1]=ele;
    return true;
  }
  else{
    //add in stk2
    if(top2==0 || top1+1==top2){
      return false;
    }
    arr[--top2]=ele;
    return true;
  }
}

int pop(int st){
  if(st==1){
    // pop from stk1
    if(top1==-1) return -1 or false;
    int ele=arr[top1--];
    return ele or true;
  }
  else{
    // pop from stk1
    if(top2==n) return false or -1;
    int ele=arr[top2++];
    return true or ele;
  }
}

int size(int st){
  if(st==1) return top1+1;
  else return n-top2;
}

int peek(int st){
  if(st==1){
    if(top1==-1) return -1;
    return arr[top1];
  }
  else{
    if(top2==n) return -1;
    return arr[top2];
  }
}

boolean isEmpty(int st){
  if(st==1){
    return top1==-1;
  }
  else{
    return top2==n;
  }
}

boolean isFull(int st){
  if(st==1){
    return top1+1 == top2;
  }
  else return top2 == 0 || top1+1 == top2;
}
