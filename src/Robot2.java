import java.util.Random;

public class Robot2 extends Robot1 {
	private String[] sayings = {};
	
	public void setSayings(String[] s){
		sayings = s;
	}
	
	private Random r = new Random();
	int sayPos;
	public void speak(){
		sayPos = r.nextInt(sayings.length);
		System.out.println(sayings[sayPos]);
	}
}
