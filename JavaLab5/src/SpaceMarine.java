public class SpaceMarine {
	private long id; //The field value must be greater than 0, The value of this field must be unique, The value of this field must be generated automatically
    private String name; //Can't be null, String can't be empty
    private Coordinates coordinates; //Can't be null
    private java.time.LocalDate creationDate; //Can't be null, the value of this field must be generated automatically
    private Long health; //Can be null, Field value must be greater than 0
    private long height;
    private AstartesCategory category; //Can be null
    private MeleeWeapon meleeWeapon; //Can't be null
    private Chapter chapter; //Can't be null
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	public Long getHealth() {
		return health;
	}
	public void setHealth(Long health) {
		this.health = health;
	}
	public long getHeight() {
		return height;
	}
	public void setHeight(long height) {
		this.height = height;
	}
	public java.time.LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.time.LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public AstartesCategory getCategory() {
		return category;
	}
	public void setCategory(AstartesCategory category) {
		this.category = category;
	}
	public MeleeWeapon getMeleeWeapon() {
		return meleeWeapon;
	}
	public void setMeleeWeapon(MeleeWeapon meleeWeapon) {
		this.meleeWeapon = meleeWeapon;
	}
	public Chapter getChapter() {
		return chapter;
	}
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
}
