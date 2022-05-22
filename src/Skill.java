import org.w3c.dom.NameList;

public class Skill {
	private String name;
	private int damage;
	
	public Skill(String name, int damage) {
		this.name =name;
		this.damage =damage;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}
