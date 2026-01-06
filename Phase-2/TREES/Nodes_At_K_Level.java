if(r==null || k<0) return 0;
if(k==) return 1;
Queue<Node> q =new LinkedList<>();
q.add(r);
lvl=0;
while(!q.isEmpty()){
  size=q.size();
  if(size==lvl) return size;
  while(size--!=0){
    TreeNode curr=q.remove();
    if(curr!=null) q.add(curr.left);
    if(curr!=null) q.add(curr.right);
  }
  lvl++;
}
return q.size();
