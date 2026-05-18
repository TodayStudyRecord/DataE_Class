package Ch20.weapon;

import Ch20.unit.Unit;

public abstract class Gun {
	
	int maxBuillitCnt;
	int curBuillitCnt;
	int power;
	
	abstract public void fire(Unit unit);
	abstract public void reload(int bullit);

}
