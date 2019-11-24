import javafx.scene.image.Image;

public class Player extends Mortals {
	
	private Image sprite;
	
	public Player(int level, float health, float damage, float speed, float posX, float posY, Image sprite) {
		super(level,health,damage,speed,posX,posY);
		this.sprite = sprite;
	}
	
	public Image getSprite() {
		return this.sprite;
	}
}
