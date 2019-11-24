
public abstract class Mortals {

	private int level;
	
	private float health;
	
	private float damage;
	
	private float speed;
	
	private float posX;
	
	private float posY;
	
	private Weapon weapon;
	
	public Mortals(int level, float health, float damage, float speed, float posX, float posY) {
		this.level = level;
		this.health = health;
		this.damage = damage;
		this.speed = speed;
		this.posX = posX;
		this.posY = posY;
	}
}
