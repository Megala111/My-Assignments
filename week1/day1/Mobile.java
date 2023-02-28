package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="M21 galaxy";
		float mobileWeight=2.1f;
		System.out.println("MobileModel:");
		System.out.println(mobileModel);
		System.out.println("Mobileweight:");
		System.out.println(mobileWeight);
	}
public void sendMsg() {
	boolean fullCharged=true;
	int mobileCost=12000;
	System.out.println("Mobile is charged full:");
	System.out.println(fullCharged);
	System.out.println("Mobilecost:");
	System.out.println(mobileCost);
}
	public static void main(String[] args) {
		
Mobile obj=new Mobile();
System.out.println("This is my mobile");
obj.makeCall();
obj.sendMsg();
System.out.println();
	}

}
