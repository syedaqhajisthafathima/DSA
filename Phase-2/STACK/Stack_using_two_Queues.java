Class Stack{
  Queue<Integer>q1;
  Queue<Integer>q2;
  public Stack(){
    q1=new LinkedList<>();
    q2=new LinkedList<>();
  }
  public void push(int x){
    q1.add(x);
  }
  public int pop(){
    if(!q1.isEmpty()) return -1;
    while(q1.size()>1){
      q2.add(q1.remove());
    }
    int ele=q1.remove();
    Queue<Integer>temp=q1;
    q1=q2;
    q2=temp;
    return ele;
  }
}
