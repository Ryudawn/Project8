package inheritance;

public class quiz2 {

	public static void main(String[] args) {
		BasicTv basictv = new BasicTv();
		basictv.mode = "on";
		basictv.channel = 7;
		basictv.volume = 20;
		basictv.showInfo();
		
		System.out.println();
		
		SmartTv smartTv = new SmartTv();
		smartTv.mode = "on";
		smartTv.channel = 7;
		smartTv.volume = 20;
		smartTv.IP = "192.168.0.111";
		smartTv.showInfo();
	}

}
class BasicTv{
	String mode;
	int volume, channel;
	
	public void showInfo() {
		System.out.println("현재상태 : " + mode + ", 채널 : " + channel + "번, 볼륨: " + volume);
	}
}
class SmartTv extends BasicTv {
	String IP;
	public void showInfo() {
		System.out.println("현재상태 : " + mode + ", 채널 : " + channel + "번, 볼륨: " + volume + ", 아이피 :" + IP);
			
	}
}