package Ch20;

import Ch20.unit.Marine;
import Ch20.unit.Medic;
import Ch20.weapon.Pistol;
import Ch20.weapon.Rifle;

public class Main_01 {

	public static void main(String[] args) {
		Marine marine1 = new Marine();
		marine1.setMyGun(new Pistol());
		marine1.getMyGun().reload(100);
		marine1.attackMethod(Marine.총기사용);
		
		Medic medic1 = new Medic();
		medic1.setType("medic1");
		
		
		marine1.setType("marine1");
		Marine marine2 = new Marine();
		marine2.setMyGun(new Rifle());
		marine2.getMyGun().reload(100);
		marine2.setType("marine2");
		
		//medic -> m1
		new Thread() {
			@Override
			public void run() {
				while(true) {
					medic1.setHealingPoint(marine1);
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		//m1 -> m2
		new Thread() {
			@Override
			public void run() {
				
				while(true) {
					marine1.attack(marine2);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}		
		}.start();
		//m2 -> m1
		new Thread() {
			@Override
			public void run() {
				while(true) {
					marine2.attack(marine1);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();;

	}

}
