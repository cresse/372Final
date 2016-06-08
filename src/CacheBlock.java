/*
 * Needs to be in its own file
 */
public class CacheBlock {
	public int address;
	public boolean dirty;
	
	public CacheBlock(int address){
		this.address = address;
	    this.dirty = false;
	}
	
	public int getAddress() {
		return address;
	}
	
	public boolean isDirty() {
		return dirty;
	}
}
