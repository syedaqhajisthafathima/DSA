Class Stack{
  int arr[];
  int top;
  public stack(int n){
    arr=new int[n];
    top=-1;
  }
  boolean push(int ele){
    if(top==arr.length-1){
      return false;//overflow
    }
    arr[++top]=ele;
    return true;
  }
  int pop(){
    if(top==-1)return -1;//underflow
    int ele=arr[top--];
    return ele;
  }
  int size(){
    return top+1;
  }
  int peek(){
    if(top==-1) return -1;
    return arr[top];
  }
  booelan isEmpty(){
    return top==-1;
  }
  boolean isFull(){
    return top==arr.length-1;
  }
}
  

  
