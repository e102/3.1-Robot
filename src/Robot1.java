
public class Robot1 {
	private double batteryCharge = 5.0; // instance variable
	
	public void batteryReCharge(double c) {
		batteryCharge += c;
		System.out.println("Battery charged. " + c + " units of charge added. Charge now at " + batteryCharge);
	}
	
	public void move(int distance) {
		int distanceMoved = 0;
		
		while(distance > 0){
			if (batteryCharge == 0){
				System.out.println("Out of charge. No more movement possible");
				break;
			}
			else{
				distance --;
				batteryCharge -= 0.5;
				distanceMoved++;
			}
		}
		System.out.println("Moved a total of " + distanceMoved + " units in this move");
		System.out.println("Battery charge level is " + batteryCharge);
	}
}
