package Ch20.building;

public abstract class Building {
	public int hp;
	public int sheld;
	public int ammor;
	public boolean isDestroyed;
	
	public Building() {};
	
	public abstract void BuildStructure();
	public abstract void UnderAttack(int damage);

	}


