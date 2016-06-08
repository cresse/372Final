import java.io.File;

public class CacheConfig {
	private int cacheLineSize;
	private int l1Size;
	private int l1Lat;
	private int l2Size;
	private int l2Lat;
	private int l3Size;
	private int l3Lat;
	private int x1LvlMemSize;
	private int x1LvlMemLat;
	private int x2LvlMemSize;
	private int x2LvlReadLat;
	private int x2LvlWriteLat;
	private int cacheAssocType;
	private boolean isWriteThrough;
	
	public CacheConfig() {
		
	}
	
	public CacheConfig(File output) {
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cache Line Size: ");
		sb.append(cacheLineSize);
		sb.append("\nL1 Size: ");
		sb.append(l1Size);
		sb.append("\nL1 Latency: ");
		sb.append(l1Lat);
		sb.append("\nL2 Size: ");
		sb.append(l2Size);
		sb.append("\nL2 Latency: ");
		sb.append(l2Lat);
		sb.append("\nL3 Size: ");
		sb.append(l3Size);
		sb.append("\nL3 Latency: ");
		sb.append(l3Lat);
		sb.append("\n1st Level Memory Size: ");
		sb.append(x1LvlMemSize);
		sb.append("\n1st Level Memory Latency: ");
		sb.append(x1LvlMemLat);
		sb.append("\n2nd Level Memory Size: ");
		sb.append(x2LvlMemSize);
		sb.append("\n2nd Level Memory Read Latency: ");
		sb.append(x2LvlReadLat);
		sb.append("\n2nd Level Memory Write Latency: ");
		sb.append(x2LvlWriteLat);
		sb.append("\n");
		sb.append(cacheAssocType);
		sb.append("-way Set Associative Cache");
		if (isWriteThrough) {
			sb.append("\nWritethrough policy");
		} else {
			sb.append("\nWriteback policy");
		}
		
		return sb.toString();
	}
	
	public int getCacheLineSize() { return cacheLineSize; }
	public int getl1Size() { return l1Size; }
	public int getl1Lat() { return l1Lat; }
	public int getl2Size() { return l2Size; }
	public int getl2Lat() { return l2Lat; }
	public int getl3Size() { return l3Size; }
	public int getl3Lat() { return l3Lat; }
	public int get1LvlMemSize() { return x1LvlMemSize; }
	public int get1LvlMemLat() { return x1LvlMemLat; }
	public int get2LvlMemSize() { return x2LvlMemSize; }
	public int get2LvlReadLat() { return x2LvlReadLat; }
	public int get2LvlWriteLat() { return x2LvlWriteLat; }
	public int getCacheType() { return cacheAssocType; }
	public boolean getWriteType() { return isWriteThrough; }
}
