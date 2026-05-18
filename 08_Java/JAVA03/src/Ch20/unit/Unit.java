package Ch20.unit;

public abstract class Unit {
	int hp;
	int amor;
	String type;
	boolean isDead;
	
	abstract public void move();
	abstract public void underAttack(int damage);
	
	public int getHp() {
		return hp;
	}
	public int getAmor() {
		return amor;
	}
	public String getType() {
		return type;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setAmor(int amor) {
		this.amor = amor;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
