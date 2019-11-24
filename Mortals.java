import javafx.scene.input.*;

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
	
	public int getLevel() {
		return level;
	}

	public float getHealth() {
		return health;
	}

	public float getDamage() {
		return damage;
	}

	public float getSpeed() {
		return speed;
	}

	public float getPosX() {
		return posX;
	}

	public float getPosY() {
		return posY;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void move(String e) {
		switch (e.toLowerCase()) {
			case("w"):
				--posY;
				break;
			case("s"):
				++posY;
				break;
			case("d"):
				++posX;
				break;
			case("a"):
				--posX;
				break;
			default:
				break;
		}
		System.out.println("(" + posX + "," + posY + ")");
	}
	
}
