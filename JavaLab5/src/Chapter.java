
public class Chapter {
    private String name; //Can't be null, String can't be empty
    private String parentLegion;
    private int marinesCount; //Field value must be greater than 0, Maximum field value: 1000
    private String world; //Can't be null
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentLegion() {
		return parentLegion;
	}
	public void setParentLegion(String parentLegion) {
		this.parentLegion = parentLegion;
	}
	public int getMarinesCount() {
		return marinesCount;
	}
	public void setMarinesCount(int marinesCount) {
		this.marinesCount = marinesCount;
	}
	public String getWorld() {
		return world;
	}
	public void setWorld(String world) {
		this.world = world;
	}
}
