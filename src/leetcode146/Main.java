package leetcode146;

public class Main {
	public static void main(String args[]){
		LRUCache cache = new LRUCache(1);
		cache.set(2, 1);
		cache.set(3, 2);
		cache.get(2);
		
	}
}
