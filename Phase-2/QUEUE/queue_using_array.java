Class Queue{
  Queue<Integer>q=new LinkedList<>();
  public void add(int ele){
    q.add(ele);
  }
  public int remove(){
    int ele=q.remove();
    return ele;
  }
  public int peek(){
    int ele=q.peek();
    return ele;
  }
  public int size(){
    int size=q.size();
    return size;
  }
  public booelan isEmpty(){
    return q1.isEmpty()
  }
}
