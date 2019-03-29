
public class Client {

	public static void main(String[] args) {
		Building building_1 = new Barracks();
		
		Unit unit_1 = building_1.createUnit();
		unit_1.attack();
		
		Building building_2 = new Gateway();
		Unit unit_2 = building_2.createUnit();
		unit_2.attack();
	}
}
