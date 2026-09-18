class Node{
    int key,val;
    Node prev,next;
    Node(int key,int val){
        this.key=key;
        this.val=val;
    }

}
class LRUCache {
    Map<Integer,Node> mpp=new HashMap<>();
    Node head,tail;
    int capacity;
    public void insertAfterHead(Node nn){
        mpp.put(nn.key,nn);
        Node tmp=head.next;
        head.next=nn;
        nn.next=tmp;
        nn.prev=head;
        tmp.prev=nn;
    }
    public void remove(Node nn){
        mpp.remove(nn.key);
        nn.prev.next=nn.next;
        nn.next.prev=nn.prev;
        
    }
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    public int get(int key) {
        if(mpp.containsKey(key)){
            Node node=mpp.get(key);
            remove(mpp.get(key));
            insertAfterHead(node);
            return node.val;
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            remove(mpp.get(key));
        }
        else if(mpp.size()==capacity){
            remove(tail.prev);
        }
        Node nn=new Node(key,value);
        insertAfterHead(nn);
    }
}
