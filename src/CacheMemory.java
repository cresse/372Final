import Java.utils.LinkedList;
public class CacheMemory{
	private Bucket[] bucketList;
	public boolean check(){
		
	}
	public CacheDriver(int buckets,int blockSize){
		bucketList = new Bucket[buckets];
		for(int i=0; i < buckets;i++){
			bucketlist[i] = new Bucket(blockSize);

		}
	}
}
private class Bucket {
	private LinkedList<MemoryThing> l;
	private MaxSize;
	public Bucket(int size){
		MaxSize = 0;
		l = newLinkedList<Integer>();
	}
	public boolean check(int address){
		for (MemoryThing a : l){
			
		}
	}
}
public class MemoryThing{
	public int address;
	public boolean dirty;
	public MemoryThing(int address){
		this.address = address;
	    this.dirty = false;
	}
}
