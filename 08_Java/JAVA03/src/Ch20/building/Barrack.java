package Ch20.building;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Ch20.unit.Marine;
import Ch20.unit.Medic;
import Ch20.unit.Unit;

public class Barrack extends Building implements ICanFly{
	
	//String : 생성할 유닛클래스명 , UnitGenerator - 생성Interface
	public Map<String, UnitGenerator> generator;
	
	public Barrack(){
		generator = new HashMap();
		generator.put("marine", new MarineGenerator());
		generator.put("medic", new MedicGenerator());
	}
	
	public UnitGenerator getGenerator(String key) {
		return generator.get(key);
	}
	public Marine genMarine() {
		return (Marine)((MarineGenerator)generator.get("marine")).Gen();
	}
	public Medic genMedic() {
		return (Medic)((MedicGenerator)generator.get("medic")).Gen();
	}
	
	public <T extends Unit> List<Unit> genUnit(Class<?> clazz,int n){
		
		List<Unit> list = new ArrayList<>();
		
		try {
			Constructor con = clazz.getConstructor(null);
			for(int i=0;i<n;i++) {
				Object obj = con.newInstance(null);
				list.add((Unit)obj);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;
	}
	
	@Override
	public void BuildStructure() {
		System.out.println("Barrack 건물 짓습니다.");
	}

	@Override
	public void UnderAttack(int damage) {
		System.out.println("Barrack 건물이 공격 당하고 있습니다.");

	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		
	}

}