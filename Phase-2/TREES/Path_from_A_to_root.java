List<Node> findPath(fp)(Node r,int a){
  if(r==null)return new ArrayList<>();
  if(r.data==a){
    List<Node>l=new ArrayList<>();
    l.add(r);
    return l;
  }  
  //left Side
  List<Node>LL=fp(r.left,a);
  if(LL.size()>0){
    LL.add(r);
    return LL;
  }

  //right Side
  List<Node> RR=fp(r.right,a);
  if(RR.size()>0){
    RR.add(r);
    return RR;
  }
  return new ArrayList<>();
}


// Instead of return new List just return by creaing global list (gl) or parameterized List(l)
gl<Node>;
List<Node> fp(Node r,int a){
  gl=new ArrayList<>();
  fph(r,a);
  return gl;
}

void fph(r,a){
  if(r==null) return;
  if(r.data==a){
    gl.add(r);
    return;
  }
  fph(r.left,a);
  if(gl.size()>0){
    gl.add(r);
    return;
  }
  fph(r.right,a);
  if(gl.size()>0){
    gl.add(r);
    return;
  }
}

//parameterized

List<Node> fp(Node r,int a){
  l=new ArrayList<>();
  fph(r,a,l);
  return l;
}

void fph(r,a,l){
  if(r==null) return;
  if(r.data==a){
    l.add(r);
    return;
  }
  fph(r.left,a,l);
  if(l.size()>0){
    l.add(r);
    return;
  }
  fph(r.right,a,l);
  if(l.size()>0){
    l.add(r);
    return;
  }
}





