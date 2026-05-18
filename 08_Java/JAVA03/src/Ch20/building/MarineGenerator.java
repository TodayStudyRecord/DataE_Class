package Ch20.building;

import Ch20.unit.Marine;
import Ch20.unit.Unit;

public class MarineGenerator implements UnitGenerator{

	@Override
	public Unit Gen() {
		
		return new Marine();
	}

	
}
