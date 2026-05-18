package Ch20.unit;

import Ch20.weapon.Gun;

public class Marine extends Unit {

	int base_damage;
	Gun myGun;
	
	int attackMethod;
	
	public final static int 총기사용=1;
	public final static int 기본공격=2;
	
	public void attackMethod(int 공격방식) {
		this.attackMethod = 공격방식;
	}
	
	public Marine() {
		this.hp = 100;
		this.amor = 100;
		this.type = "해병";
		
		this.base_damage = 10;
	}
	
	
	public int getBase_damage() {
		return base_damage;
	}

	public void setBase_damage(int base_damage) {
		this.base_damage = base_damage;
	}

	public Gun getMyGun() {
		return myGun;
	}

	public void setMyGun(Gun myGun) {
		this.myGun = myGun;
	}

	public void attack(Unit unit) {
		if(!unit.isDead) {
			
			if(this.attackMethod==this.총기사용)
				myGun.fire(unit);
			else
				unit.underAttack(this.base_damage);
				;
			
		}
	}
	
	@Override
	public void move() {
		System.out.println(this.type + "이 이동합니다.");
		
	}

	@Override
	public void underAttack(int damage) {
		
		//amor -> hp -> dead
		if(amor - damage > 0)
			amor -= damage;
		else if(hp - (amor - damage)>0) {
			hp = hp - (damage - amor);
			amor = 0;
		}
		else {
			hp=0;amor=0;
			isDead = true;
			System.out.println("[경고]" + this.type + "전사했습니다.");
		}
		
	}

}
