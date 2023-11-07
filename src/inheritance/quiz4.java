package inheritance;

public class quiz4 {

	public static void main(String[] args) {
		Monster monster = new Monster();
		monster.ap = 10;
		monster.hp = 100;
		monster.at = 10;
		monster.showInfo();
		
		System.out.println();
		
		Slime slime = new Slime();
		slime.ap = 30;
		slime.hp = 200;
		slime.at = 30;
		slime.skill = "마비";
		slime.showInfo();
	}

}
class Monster {
	int ap ;
	int hp;
	int at;
	
	public void showInfo(){
		System.out.println("몬스터의 공격력은 " + ap + "이고, 체력은 " + hp + "이다.");
		System.out.println("몬스터가 " + at + "만큼 공격했다 !");
	}
}
class Slime extends Monster{
	String skill;
	
	public void showInfo(){
		System.out.println("몬스터의 공격력은 " + ap + "이고, 체력은 " + hp + "이다.");
		System.out.println("몬스터가 " + at + "만큼 공격했다 !");
		System.out.println("슬라임이" + skill + "스킬을 시전했다");
	}
}
