
public class RobotTester {

	public static void main(String[] args) {
		Robot1 r = new Robot1(); // start off with a well-charged battery
		r.move(11); // move around and use up the charge
		r.batteryReCharge(2.5); // get a new charge
		r.batteryReCharge(0.5); // add a bit more
		r.move(5); // move some more
		
		
		
		Robot2 r1 = new Robot2();
		String[] u1 = { "Exterminate, Exterminate!", "I obey!",
		"You cannot escape.", "Robots do not feel fear.",
		 "The Robots must survive!" };
		r1.setSayings(u1);
		System.out.println("\nRobot r1 says: ");
		for (int i = 0; i < 10; i++) {
			r1.speak();
		}
		
		System.out.println("\nRobot r2 says: ");
		
		Robot2 r2 = new Robot2();
		String[] u2 = { "I obey!" };
		r2.setSayings(u2);
		for (int i = 0; i < 10; i++) {
			r2.speak();
		}

		}
}
