package Ch20.unit;

public class Medic extends Unit {

	private int HealingPoint;

	public Medic() {
		this.hp = 100;
		this.amor = 100;
		this.HealingPoint = 20;
		this.type = "의무병";
	}

	
	
	public void setHealingPoint(Unit unit) {
		
		unit.hp += this.HealingPoint;
		System.out.println("대상 " + unit.type + "HP 를 회복 시킵니다. 현재 HP : " + unit.hp);
		
	}



	@Override
	public void move() {
		System.out.println(this.type + "이 이동합니다.");

	}

	@Override
	public void underAttack(int damage) {
		// amor -> hp -> dead
		if (amor - damage > 0)
			amor -= damage;
		else if (hp - (amor - damage) > 0)
			hp = hp - (amor - damage);
		else { 
			hp = 0;
			amor = 0;
			isDead = true;
			System.out.println("[경고]" + this.type + "전사했습니다.");
		}

	}

}
