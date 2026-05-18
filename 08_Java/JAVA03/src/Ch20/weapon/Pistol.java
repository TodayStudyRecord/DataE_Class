package Ch20.weapon;

import Ch20.unit.Unit;

public class Pistol extends Gun{
	
	public Pistol() {
		this.power = 10;
		this.curBuillitCnt = 0;
		this.maxBuillitCnt = 0;
		
		
	}

	@Override
	public void fire(Unit unit) {
	
		if(curBuillitCnt==0) {
			System.out.println("[경고] 재장전이 필요합니다");
			return;
		}
		
		unit.underAttack(this.power);
		curBuillitCnt--;
		System.out.println("[정보] " + unit.getType() + " 에게 "+ this.power + " 만큼 피해를 입혔습니다. 현재 HP : " + unit.getHp() + "현재AMOR : " + unit.getAmor());
	}

	@Override
	public void reload(int buillit) {
		if(this.maxBuillitCnt>(buillit+this.curBuillitCnt))
			this.curBuillitCnt+=maxBuillitCnt;
		else
			this.curBuillitCnt+=buillit;
		
		System.out.println("[정보] 재장전 완료");
	}

}
