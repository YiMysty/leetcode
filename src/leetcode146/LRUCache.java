package leetcode146;
import java.util.HashMap;
public class LRUCache {
    int capacity;
    HashMap<Integer,Link> map;
    Link head = new Link(-1,-1);
    Link tail = new Link(-2,-2);
    public LRUCache(int capacity) {
    	this.capacity = capacity;
    	map = new HashMap<Integer,Link>();
    	head.next = tail;
    	tail.pre = head;
    	//Debug();
    }
    public int get(int key) {
    	if(!map.containsKey(key))
    		return -1;
    	Link node = map.get(key);
    	insertHead(node);
    	return node.value;
    }
    private void insertHead(Link node){
    	if(node.pre!=null){
    		node.pre.next = node.next;
    		node.next.pre = node.pre;
    	}
		node.next = head.next;
		node.next.pre = node;
		head.next = node;
		node.pre = head;
		//Debug();
    }
    private int removeTail(){
    	Link node = tail.pre;
    	tail.pre = node.pre;
    	tail.pre.next = tail;
    	return node.key;
    }
    public void set(int key, int value) {
    	if(map.containsKey(key)){
    		Link node = map.get(key);
    		insertHead(node);
    		map.get(key).value = value;
    	}else if(capacity>map.size()){
    		Link node = new Link(key,value);
    		insertHead(node);
    		map.put(key,node);
    	}else{
    		//exchange cache
    		int validKey = removeTail();
    		map.remove(validKey);
    		Link node = new Link(key,value);
    		insertHead(node);
    		map.put(key, node);
    	}
    }
    public void Debug(){
    	Link Temp = head;
		while(Temp!=null){
			System.out.print(Temp.value+" ");
			Temp=Temp.next;
		}
		System.out.println();
    }
    class Link{
    	public int value;
    	public Link pre;
    	public Link next;
    	public int key;
    	public Link(int key,int value){
    		this.value = value;
    		this.next = null;
    		this.pre = null;
    		this.key = key;
    	}
    }
}