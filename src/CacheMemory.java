import java.util.LinkedList;
public class CacheMemory {
	private Bucket[] bucketList;

	public void cacheDriver(int buckets,int blockSize){
		bucketList = new Bucket[buckets];
		for(int i= 0; i < buckets;i++){
			bucketList[i] = new Bucket(blockSize);
		}
	}
	
	public boolean check(int address) {
		boolean exists = false;
		for (Bucket b : bucketList) {
			if (b.check(address)) {
				exists = true;
				break;
			}
		}
		return exists;
	}
	
	//if writePolicy is true, it's write through
	public void read(int address, boolean writePolicy) {
		boolean exists = check(address);
		if (!exists && writePolicy) {
			//locate cache block to use
			//read data from lower memory into the cache block
		} else if (!exists && !writePolicy) {
			//locate cache block to use
			//check cache block if it's dirty
			//if dirty
				//write to memory
			//read data from lower memory into the cache block
			//mark cache as not dirty
		}
		//add to latency
		//add to hit values
		//add to total instructions
		//return data
	}
	
	public void write(int address, boolean writePolicy) {
		boolean exists = check(address);
		if (!exists && writePolicy) {
			//write address to cache block
		} else if (!exists && !writePolicy) {
			//locate cache block to use
			//if dirty
				//write previous data back to lower memory
			//read data from lower memory into the cache block
			//write new data into cache block
			//mark as dirty
		}
		//write data into lower memory
		//add to latency
		//add to total instructions
	}
}

class Bucket {
	//used as 'queue' structure
	//front of list is LRU
	private LinkedList<CacheBlock> l;
	private int maxSize;
	
	public Bucket(int size){
		maxSize = size;
		l = new LinkedList<CacheBlock>();
	}
	
	public boolean check(int address){
		boolean exists = false;
		for (CacheBlock a : l){
			if (a.getAddress() == address) {
				exists = true;
				break;
			}
		}
		return exists;
	}
	
	public CacheBlock findUseableBlock(int address) {
		//bitmask address for tag
		//bitmask address for index
		//check 
		return new CacheBlock(0);
	}
}

class L3 {
	
}

class L2 {
	
}

class L1 {
	
}
