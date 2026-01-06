import java.util.*;

class Node{
  int key;
  int value;
  Node prev;
  Node next;
  Node(int key,int value){
    this.key=key;
    this.value=value;
    prev=next=null;
  }
}

class LRUCache{
  Node head;
  Node tail;
  Map<Integer,Node>m;
  int capacity;
  public LRUCache(int capacity){
    this.capacity=capacity;
    m=new HashMap<>();
    head=new Node(-1,-1);
    tail=new Node(-1,-1);
    head.next=tail;
    tail.prev=head;
  }
  public int get(int key){
    if(!m.containsKey(key)){
      return -1;
    }
    else{
      Node node=m.get(key);
      delete(node);
      insert(node);
      return node.value;
    }
  }
  public void put(int key,int value){
    if(m.containsKey(key)){
      Node node=m.get(key);
      node.value=value;
      delete(node);
      insert(node);
    }
    else{
      if(m.size()==capacity){
        Node node=tail.prev;
        m.remove(node.key);
        delete(node);
      }
      Node newNode=new Node(key,value);
      insert(newNode);
      m.put(key,newNode);
    }
  }

  public void insert(Node node){
    Node after =head.next;
    node.next=after;
    node.prev=head;
    after.prev=node;
    head.next=node;
  }

  public void delete(Node node){
    Node before =node.prev;
    Node after=node.next;
    before.next=after;
    after.prev=before;
    node.next=null;
    node.prev=null;
  }
}
