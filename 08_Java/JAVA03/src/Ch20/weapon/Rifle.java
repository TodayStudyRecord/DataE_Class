package Ch20.weapon;

import Ch20.unit.Unit;

public class Rifle extends Gun{

	public Rifle() {
		this.power = 50;
		this.curBuillitCnt = 0;
		this.maxBuillitCnt = 100;
		
		
	}
	
	
	@Override
	public void fire(Unit unit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reload(int bullit) {
		if(this.maxBuillitCnt>(bullit+this.curBuillitCnt))
			this.curBuillitCnt+=maxBuillitCnt;
		else
			this.curBuillitCnt+=bullit;
		
		System.out.println("[정보] 재장전 완료");
	}

}
